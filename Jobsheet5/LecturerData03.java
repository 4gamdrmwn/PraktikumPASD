package Jobsheet5;

public class LecturerData03 {
    // menyiapkan array dengan kapasitas maksimal 10 data
    Lecturer03[] lecturerData = new Lecturer03[10];
    int idx = 0; // index untuk melacak jumlah data yang sudah masuk

    public void add(Lecturer03 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn; // memasukkan objek dosen ke index saat ini
            idx++; // geser index ke posisi berikutnya
        } else {
            System.out.println("Data is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print(); // memanggil method print milik class Lecturer03
        }
    }

    public void sortingASC() { // menggunakan Bubble Sort berdasarkan Usia (Muda ke Tua)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer03 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() { // menggunakan Selection Sort berdasarkan Usia (Tua ke Muda)
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i; // asumsikan index saat ini adalah usia tertua
            for (int j = i + 1; j < idx; j++) { // cari index dengan usia tertua
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j; // update index tertua jika ditemukan yang lebih tua
                }
            }
            // tukar data dosen pada index tertua dengan index saat ini
            Lecturer03 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}