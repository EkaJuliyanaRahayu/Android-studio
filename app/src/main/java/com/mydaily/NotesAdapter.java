package com.mydaily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {

    private List<String> notesList;

    // Constructor
    public NotesAdapter(List<String> notesList) {
        this.notesList = notesList;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout untuk setiap item catatan
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notes, parent, false); // Pastikan file XML item_notes ada
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        // Ambil data catatan dari list berdasarkan posisi dan atur ke TextView
        String note = notesList.get(position);
        holder.noteTitle.setText(note); // Pastikan ID sesuai dengan item_notes.xml
    }

    @Override
    public int getItemCount() {
        return notesList.size(); // Mengembalikan jumlah data dalam list
    }

    // Metode untuk memperbarui data dalam adapter
    public void updateData(List<String> newData) {
        // Mengupdate data list dan memberi tahu adapter untuk memperbarui tampilan
        this.notesList.clear(); // Kosongkan data lama
        this.notesList.addAll(newData); // Tambahkan data baru
        notifyDataSetChanged(); // Beri tahu RecyclerView untuk memperbarui tampilan
    }

    // ViewHolder untuk memegang referensi elemen UI
    public static class NotesViewHolder extends RecyclerView.ViewHolder {

        TextView noteTitle; // Referensi untuk TextView yang akan menampilkan judul catatan

        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            // Menghubungkan komponen UI di item_notes.xml dengan ViewHolder
            noteTitle = itemView.findViewById(R.id.noteTitle); // Pastikan ID sesuai dengan item_notes.xml
        }
    }
}
