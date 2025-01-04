package com.mydaily;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Nama database dan versi
    private static final String DATABASE_NAME = "MyDaily.db";
    private static final int DATABASE_VERSION = 2; // Increment versi database

    // Nama tabel
    private static final String TABLE_PLANS = "plans"; // Tabel untuk rencana
    private static final String TABLE_NOTES = "notes"; // Tabel untuk catatan

    // Kolom tabel plans
    private static final String COLUMN_PLAN_ID = "id";
    private static final String COLUMN_PLAN_TITLE = "title";
    private static final String COLUMN_PLAN_CONTENT = "content";
    private static final String COLUMN_PLAN_DATE = "date";
    private static final String COLUMN_PLAN_STATUS = "status";

    // Kolom tabel notes
    private static final String COLUMN_NOTE_ID = "note_id";
    private static final String COLUMN_NOTE_TITLE = "note_title";
    private static final String COLUMN_NOTE_CONTENT = "note_content";
    private static final String COLUMN_NOTE_DATE = "note_date";

    // SQL untuk membuat tabel plans
    private static final String CREATE_TABLE_PLANS =
            "CREATE TABLE " + TABLE_PLANS + " (" +
                    COLUMN_PLAN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_PLAN_TITLE + " TEXT NOT NULL, " +
                    COLUMN_PLAN_CONTENT + " TEXT, " +
                    COLUMN_PLAN_DATE + " TEXT, " +
                    COLUMN_PLAN_STATUS + " TEXT)";

    // SQL untuk membuat tabel notes
    private static final String CREATE_TABLE_NOTES =
            "CREATE TABLE " + TABLE_NOTES + " (" +
                    COLUMN_NOTE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NOTE_TITLE + " TEXT NOT NULL, " +
                    COLUMN_NOTE_CONTENT + " TEXT, " +
                    COLUMN_NOTE_DATE + " TEXT)";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Membuat tabel plans dan notes
        db.execSQL(CREATE_TABLE_PLANS);
        db.execSQL(CREATE_TABLE_NOTES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Menghapus tabel lama dan membuat ulang tabel baru jika versi database berubah
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PLANS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTES);
        onCreate(db);
    }

    // Metode untuk menambahkan catatan ke tabel notes
    public boolean addNote(String title, String content, String date) {
        if (title == null || title.trim().isEmpty()) {
            return false; // Validasi: title tidak boleh kosong
        }

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NOTE_TITLE, title);
        values.put(COLUMN_NOTE_CONTENT, content);
        values.put(COLUMN_NOTE_DATE, date);

        long result = db.insert(TABLE_NOTES, null, values);
        return result != -1; // Mengembalikan true jika berhasil
    }

    // Metode untuk mengambil semua catatan dari tabel notes
    public Cursor getAllNotes() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_NOTES, null, null, null, null, null, COLUMN_NOTE_ID + " DESC");
    }

    // Metode untuk memperbarui catatan berdasarkan id
    public boolean updateNote(int id, String title, String content, String date) {
        if (title == null || title.trim().isEmpty()) {
            return false; // Validasi: title tidak boleh kosong
        }

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NOTE_TITLE, title);
        values.put(COLUMN_NOTE_CONTENT, content);
        values.put(COLUMN_NOTE_DATE, date);

        int rows = db.update(TABLE_NOTES, values, COLUMN_NOTE_ID + "=?", new String[]{String.valueOf(id)});
        return rows > 0; // True jika ada baris yang diperbarui
    }

    // Metode untuk menghapus catatan berdasarkan id
    public boolean deleteNote(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int rows = db.delete(TABLE_NOTES, COLUMN_NOTE_ID + "=?", new String[]{String.valueOf(id)});
        return rows > 0; // True jika ada baris yang dihapus
    }

    // Menambahkan rencana ke tabel plans
    public boolean addPlan(String title, String content, String date, String status) {
        if (title == null || title.trim().isEmpty()) {
            return false; // Validasi: title tidak boleh kosong
        }

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_PLAN_TITLE, title);
        values.put(COLUMN_PLAN_CONTENT, content);
        values.put(COLUMN_PLAN_DATE, date);
        values.put(COLUMN_PLAN_STATUS, status);

        long result = db.insert(TABLE_PLANS, null, values);
        return result != -1; // Mengembalikan true jika berhasil
    }

    // Mendapatkan semua rencana dari tabel plans
    public Cursor getAllPlans() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_PLANS, null, null, null, null, null, COLUMN_PLAN_ID + " DESC");
    }

    // Menutup database setelah digunakan
    public void close() {
        super.close();
    }

    public void closeCursor(Cursor cursor) {
    }
}
