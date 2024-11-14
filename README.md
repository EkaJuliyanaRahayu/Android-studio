| Nama | Eka Juliyana Rahayu |
| ----- | ------------------- | 
| NIM | 31231059 |
| Kelas | TI.23.A6 |

# Story Board dan Mock Up

![mock up dan story board app my daily-1](https://github.com/user-attachments/assets/3173c804-ffa8-4aeb-b4f6-4ddac72e1db7)


# UI

![1](https://github.com/user-attachments/assets/c5131a87-dfe0-4ee9-843d-c876aeec0708)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/lilac"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="220dp"
        android:layout_marginStart="130dp"
        android:layout_marginLeft="130dp"
        android:layout_marginTop="270dp"
        android:layout_marginEnd="100dp"
        android:layout_marginRight="130dp"
        android:layout_marginBottom="130dp"
        android:contentDescription="@string/gambar"
        android:src="@drawable/gambar"
        tools:ignore="ImageContrastCheck" />


</LinearLayout>
```
![2](https://github.com/user-attachments/assets/c947d4a2-7a58-4a69-a61c-9ec82c6d72be)
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background"
    tools:context=".home">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="188dp"
        android:layout_height="65dp"
        android:layout_marginTop="36dp"
        android:layout_marginEnd="100dp"
        android:contentDescription="@string/welcome"
        android:src="@drawable/welcome"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.227"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="MissingConstraints" />

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="145dp"
        android:layout_height="168dp"
        android:layout_marginTop="48dp"
        android:layout_marginEnd="36dp"
        android:contentDescription="@string/image"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageView"
        app:srcCompat="@drawable/image"
        tools:ignore="ImageContrastCheck" />


    <TextView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginStart="28dp"
        android:layout_marginTop="368dp"
        android:fontFamily="@font/extrabold"
        android:text="Let's Go"
        android:textColor="@color/black"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/button2"
        android:layout_width="355dp"
        android:layout_height="123dp"
        android:layout_marginStart="28dp"
        android:background="@drawable/button"
        android:fontFamily="@font/extrabold"
        android:gravity="left"
        android:padding="40dp"
        android:text="Make Your Plan"
        android:textStyle="bold"
        android:textColor="#33363F"
        android:textSize="32sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_editor_absoluteY="446dp"
        app:layout_editor_absoluteX="28dp"
        app:layout_constraintVertical_bias="0.646" />

    <TextView
        android:id="@+id/button3"
        android:layout_width="355dp"
        android:layout_height="123dp"
        android:layout_marginStart="28dp"
        android:background="@drawable/button"
        android:fontFamily="@font/extrabold"
        android:gravity="left"
        android:padding="40dp"
        android:text="Make Your Notes"
        android:textStyle="bold"
        android:textColor="#33363F"
        android:textSize="32sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_editor_absoluteX="28dp"
        app:layout_editor_absoluteY="618dp"
        app:layout_constraintVertical_bias="0.884" />

    <ImageView
        android:id="@+id/waktu"
        android:layout_width="37dp"
        android:layout_height="37dp"
        android:layout_marginStart="332dp"
        android:src="@drawable/calender"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.635" />

    <ImageView
        android:id="@+id/tulis"
        android:layout_width="30dp"
        android:layout_height="29dp"
        android:layout_marginStart="340dp"
        android:src="@drawable/pencil"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.839" />



</androidx.constraintlayout.widget.ConstraintLayout>
```
![3](https://github.com/user-attachments/assets/3a2fafcc-c79a-4fd4-8273-5d7719214e88)
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F8F8FF"
    tools:context=".Plan">

    <TextView
        android:id="@+id/button2"
        android:layout_width="335dp"
        android:layout_height="60dp"
        android:layout_marginStart="60dp"
        android:background="@drawable/button2"
        android:fontFamily="@font/extrabold"
        android:gravity="center"
        android:text="Search"
        android:textColor="#F5F5F5"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.05"
        app:layout_editor_absoluteY="61dp"
        app:layout_editor_absoluteX="56dp"/>

    <ImageView
        android:id="@+id/addBtn"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="320dp"
        android:src="@drawable/add"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.922"
        app:layout_editor_absoluteX="307dp"
        app:layout_editor_absoluteY="791dp" />

    <ImageView
        android:layout_width="20dp"
        android:layout_height="20dp"
        android:layout_marginStart="70dp"
        android:src="@drawable/search"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.146"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.075"
        app:layout_editor_absoluteX="95dp"
        app:layout_editor_absoluteY="77dp" />

    <ImageView
        android:id="@+id/panah"
        android:layout_width="27dp"
        android:layout_height="27dp"
        android:src="@drawable/iconback"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.041"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.068"
        app:layout_editor_absoluteX="11dp"
        app:layout_editor_absoluteY="77dp" />


</androidx.constraintlayout.widget.ConstraintLayout>
```
![4](https://github.com/user-attachments/assets/81964849-d92c-41dd-a7af-027a607ae05e)
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F8F8FF"
    tools:context=".write_plan">

    <TextView
        android:id="@+id/write"
        android:layout_width="match_parent"
        android:layout_height="98dp"
        android:background="@drawable/button3"
        android:fontFamily="@font/extrabold"
        android:gravity="center"
        android:text="Judul"
        android:textColor="#F5F5F5"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        app:layout_editor_absoluteX="-20dp"
        app:layout_editor_absoluteY="0dp" />

    <ImageView
        android:id="@+id/panah2"
        android:layout_width="27dp"
        android:layout_height="27dp"
        android:src="@drawable/iconback"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.041"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.042"
        app:layout_editor_absoluteX="26dp"
        app:layout_editor_absoluteY="36dp" />

    <TextView
        android:id="@+id/tanda"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="28dp"
        android:background="@drawable/penanda"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="40dp"
        app:layout_editor_absoluteY="839dp" />

    <TextView
        android:id="@+id/waktu"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="180dp"
        android:background="@drawable/calender2"
        android:gravity="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="181dp"
        app:layout_editor_absoluteY="839dp" />

    <TextView
        android:id="@+id/Simpan"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="332dp"
        android:background="@drawable/save"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="320dp"
        app:layout_editor_absoluteY="839dp" />




</androidx.constraintlayout.widget.ConstraintLayout>
```
![5](https://github.com/user-attachments/assets/e5c3797b-6ede-4313-b65b-bd52bf48f869)
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F8F8FF"
    tools:context=".write_plan">

    <TextView
        android:id="@+id/write"
        android:layout_width="match_parent"
        android:layout_height="98dp"
        android:background="@drawable/button3"
        android:fontFamily="@font/extrabold"
        android:gravity="center"
        android:text="Judul"
        android:textColor="#F5F5F5"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.0"
        app:layout_editor_absoluteX="-20dp"
        app:layout_editor_absoluteY="0dp" />

    <ImageView
        android:id="@+id/panah2"
        android:layout_width="27dp"
        android:layout_height="27dp"
        android:src="@drawable/iconback"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.041"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.042"
        app:layout_editor_absoluteX="26dp"
        app:layout_editor_absoluteY="36dp" />

    <TextView
        android:id="@+id/tanda"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="32dp"
        android:background="@drawable/penanda"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="40dp"
        app:layout_editor_absoluteY="839dp" />

    <TextView
        android:id="@+id/waktu"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="196dp"
        android:background="@drawable/galeri"
        android:gravity="center"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="181dp"
        app:layout_editor_absoluteY="839dp" />

    <TextView
        android:id="@+id/Simpan"
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:layout_marginStart="332dp"
        android:background="@drawable/save"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.958"
        app:layout_editor_absoluteX="320dp"
        app:layout_editor_absoluteY="839dp" />


</androidx.constraintlayout.widget.ConstraintLayout>
```
