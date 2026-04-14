package cm;

public class LoanData {
    Loan[] loans = new Loan[10]; // array of object untuk menyimpan data peminjaman
    int idx = 0;

    public void add(Loan l) { // method untuk menambahkan data ke array
        loans[idx++] = l;
    }

    public void print() { // menampilkan semua data peminjaman
        for (int i = 0; i < idx; i++) {
            loans[i].print();
        }
    }

    public void sortByFineDesc() { // sorting menggunakan insertion sort berdasarkan denda terbesar
        for (int i = 1; i < idx; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].fine < temp.fine) { // bandingkan denda
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }

    public int binarySearch(String nim) { // searching menggunakan binary search berdasarkan NIM
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int compare = loans[mid].student.nim.compareTo(nim); // membandingkan NIM

            if (compare == 0) { // jika ditemukan
                return mid;
            } else if (compare < 0) { // cari ke kanan
                left = mid + 1;
            } else { // cari ke kiri
                right = mid - 1;
            }
        }
        return -1; // jika tidak ditemukan
    }
}