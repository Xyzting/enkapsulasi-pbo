# Aplikasi Input Data Mahasiswa - JavaFX

Proyek ini merupakan implementasi GUI JavaFX untuk menginput data mahasiswa menggunakan konsep _encapsulation_ (enkapsulasi) pada Java. Program menggunakan class `Mahasiswa` dari Worksheet 6 dan menyediakan form untuk memasukkan Nama, NIM, Jurusan, dan Umur.

## Fitur

- Form input data mahasiswa (Nama, NIM, Jurusan, Umur)
- Validasi data menggunakan setter
- Menampilkan data mahasiswa yang berhasil disimpan
- Alert otomatis jika input tidak valid
- Penerapan _Encapsulation_ pada class `Mahasiswa`

## Konsep OOP yang Digunakan

| Konsep          | Implementasi                                                        |
| --------------- | ------------------------------------------------------------------- |
| Encapsulation   | Atribut `Mahasiswa` bersifat private, akses melalui getter & setter |
| Data Validation | Setter melakukan validasi sebelum data disimpan                     |
| Object Creation | Tombol "Simpan" akan membuat objek `Mahasiswa`                      |

## Struktur Project

src/
├─ main/
│ ├─ MainMahasiswaFX.java
│ └─ Mahasiswa.java

## Cara Menjalankan

1. Pastikan Java dan JavaFX sudah terinstall
2. Import project ke IDE (IntelliJ / NetBeans / Eclipse)
3. Jalankan file:

```bash
MainMahasiswaFX.java
```

## Validasi inputan

Program akan menampilkan alert jika terdapat:

- Form kosong
- Nama mengandung angka
- Umur bukan angka / kurang dari 0
- Jurusan memliki minimal karakter 3

## Screenshots Aplikasi

### GUI - Valid Data

![Validate data](/screenshoots/validate-data.png)

### GUI - Validasi Error Form Kosong

![Validasi form kosong](/screenshoots/validasi-empty.png)

### GUI - Validasi Nama Mengandung Angka

![Validasi mengandung angka](/screenshoots/validasi-nama.png)

### GUI - Validasi Umur kurang dari 0

![Validasi umur kurang dari 0](/screenshoots/validasi-umur.png)

### GUI - Validasi Jurusan memiliki minimal karakter 3

![Validasi jurusan memiliki minimal karakter](/screenshoots/validasi-jurusan.png)
