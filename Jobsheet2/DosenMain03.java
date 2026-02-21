package Jobsheet2;

public class DosenMain03 {
    public static void main(String[] args) {
        // def constructor
        Dosen03 d1 = new Dosen03();
        d1.idLecturer = "DSN001";
        d1.name = "Budi Santoso";
        d1.activeStatus = true;
        d1.yearOfEntry = 2018;
        d1.expertiseCompetency = "Pemrograman Java";

        d1.displayInformation();
        d1.setActiveStatus(false);
        System.out.println("Masa kerja: " + d1.calculateTimeWork(2026) + " tahun");
        d1.changeSkill("Struktur Data");
        System.out.println();

        // parameterized constr
        Dosen03 d2 = new Dosen03("DSN002", "Siti Aminah", true, 2020, "Basis Data");
        d2.displayInformation();
        System.out.println("Masa kerja: " + d2.calculateTimeWork(2026) + " tahun");
    }
}
