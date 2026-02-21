package Jobsheet2;

public class Dosen03 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Dosen03() {
    }

    public Dosen03(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void displayInformation() {
        System.out.println("ID: " + idLecturer);
        System.out.println("Nama: " + name);
        System.out.println("Status Aktif: " + activeStatus);
        System.out.println("Tahun Masuk: " + yearOfEntry);
        System.out.println("Keahlian: " + expertiseCompetency);
    }

    void setActiveStatus(boolean status) {
        activeStatus = status;
        System.out.println("Status aktif diubah menjadi: " + activeStatus);
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Keahlian diubah menjadi: " + expertiseCompetency);
    }
}
