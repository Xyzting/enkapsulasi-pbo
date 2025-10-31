package com.example;

import java.util.Arrays;
import java.util.Date;

public final class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;

    private int umur;

    private Date tglLahir;
    private String[] skils;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, int umur) {
        setNama(nama);
        setNim(nim);
        setJurusan(jurusan);
        setUmur(umur);
    }

    public boolean validationData(String data) {
        return data != null && !data.equals("");
    }

    // SETTER
    public void setNama(String nama) {
        if (!validationData(nama)) {
            throw new IllegalArgumentException("Nama tidak boleh kosong!");
        }

        if (nama.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Nama tidak boleh mengandung angka!");
        }

        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        if (!validationData(jurusan)) {
            throw new IllegalArgumentException("Jurusan tidak boleh kosong!");
        }

        if (jurusan.length() < 3) {
            throw new IllegalArgumentException("Jurusan minimal 3 karakter!");
        }

        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            throw new IllegalArgumentException("Umur tidak boleh kurang dari 0!");
        }
    }

    public void setTglLahir(Date tglLahir) {
        if (tglLahir == null) {
            throw new IllegalArgumentException("Tanggal lahir tidak boleh null!");
        }
        this.tglLahir = new Date(tglLahir.getTime());
    }

    public Date getTglLahir() {
        return new Date(this.tglLahir.getTime());
    }

    public void setSkills(String[] skills) {
        if (skills == null) {
            throw new IllegalArgumentException("Skills tidak boleh null!");
        }
        this.skils = skills.clone();
    }

    public String[] getSkills() {
        return this.skils.clone();
    }

    // GETTER
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public int getUmur() {
        return this.umur;
    }

    // SHOW DATA
    public void showMahasiswa() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("NIM Mahasiswa: " + this.nim);
        System.out.println("Jurusan Mahasiswa: " + this.jurusan);
        System.out.println("Umur: " + this.umur);
        System.out.println("Tanggal Lahir: " + this.tglLahir);
        System.out.println("Skills: " + Arrays.toString(this.skils.clone()));
    }
}
