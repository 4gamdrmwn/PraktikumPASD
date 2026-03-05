package Jobsheet3;

public class Dosen03 {
    
    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public Dosen03() {
        this.kode         = "";
        this.nama         = "";
        this.jenisKelamin = true;
        this.usia         = 0;
    }

    public Dosen03(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode         = kode;
        this.nama         = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia         = usia;
    }

    public void tambahData(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode         = kode;
        this.nama         = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia         = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode          : " + this.kode);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Jenis Kelamin : " + (this.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia          : " + this.usia + " Tahun");
        System.out.println("------------------------------------------");
    }
}