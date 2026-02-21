package Jobsheet2;

public class DosenMain03 {
    public static void main(String[] args) {
        // def constructor
        Dosen03 d1 = new Dosen03();
        d1.idLecturer = "VAL";
        d1.name = "Vivin Ayu Lestari, S.Pd., M.Kom.";
        d1.activeStatus = true;
        d1.yearOfEntry = 2018;
        d1.expertiseCompetency = "Dasar Pemrograman";

        d1.displayInformation();
        d1.setActiveStatus(false);
        System.out.println("Masa kerja: " + d1.calculateTimeWork(2026) + " tahun");
        d1.changeSkill("Algoritma dan Struktur Data");
        System.out.println();

        // parameterized constr
        Dosen03 d2 = new Dosen03("HP", "Hendra Pradibta, S.E., M.Sc.", true, 2020, "Analisis Proses Bisnis");
        d2.displayInformation();
        System.out.println("Masa kerja: " + d2.calculateTimeWork(2026) + " tahun");
    }
}
