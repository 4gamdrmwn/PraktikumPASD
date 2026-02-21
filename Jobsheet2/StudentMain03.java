package Jobsheet2;

public class StudentMain03 {
    public static void main(String[] args) {
        mahasiswa03 mhs1 = new mahasiswa03(); // instantiation

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();


        mahasiswa03 mhs2 = new mahasiswa03("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa03 mhsAgam = new mahasiswa03("Agam Raja Koding", "254107060108", 3.80, "SIB 1G");
        mhsAgam.tampilkanInformasi();
    }
}
