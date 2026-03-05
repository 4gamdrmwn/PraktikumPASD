package Jobsheet3;

public class MataKuliah03 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah03() {
        this.kode      = "";
        this.nama      = "";
        this.sks       = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah03(String kode, String nama, int sks, int jumlahJam) {
        this.kode      = kode;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode      = kode;
        this.nama      = nama;
        this.sks       = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("-----------------------------------------");
    }
}