package Jobsheet3;

public class DataDosen03 {

    
    public void dataSemuaDosen(Dosen03[] arrayOfDosen03) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        int nomor = 1;
        for (Dosen03 d : arrayOfDosen03) {
            System.out.println("Data Dosen ke-" + nomor);
            d.cetakInfo();
            nomor++;
        }
    }

    
    public void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int jumlahPria   = 0;
        int jumlahWanita = 0;

        for (Dosen03 d : arrayOfDosen03) {
            if (d.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria   + " Orang");
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita + " Orang");
        System.out.println("Total Dosen         : " + arrayOfDosen03.length + " Orang");
        System.out.println("------------------------------------------");
    }

    
    public void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen03) {
        int totalUsiaPria   = 0;
        int totalUsiaWanita = 0;
        int jumlahPria      = 0;
        int jumlahWanita    = 0;

        for (Dosen03 d : arrayOfDosen03) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria   = (jumlahPria   > 0) ? (double) totalUsiaPria   / jumlahPria   : 0;
        double rerataUsiaWanita = (jumlahWanita > 0) ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\n===== RATA-RATA USIA PER JENIS KELAMIN =====");
        System.out.printf("Rata-rata Usia Dosen Pria   : %.2f Tahun%n", rerataUsiaPria);
        System.out.printf("Rata-rata Usia Dosen Wanita : %.2f Tahun%n", rerataUsiaWanita);
        System.out.println("------------------------------------------");
    }

    
    public void infoDosenPalingTua(Dosen03[] arrayOfDosen03) {
        Dosen03 dosenTua = arrayOfDosen03[0];

        for (Dosen03 d : arrayOfDosen03) {
            if (d.usia > dosenTua.usia) {
                dosenTua = d;
            }
        }

        System.out.println("\n========== DOSEN PALING TUA ==========");
        dosenTua.cetakInfo();
    }

    
    public void infoDosenPalingMuda(Dosen03[] arrayOfDosen03) {
        Dosen03 dosenMuda = arrayOfDosen03[0];

        for (Dosen03 d : arrayOfDosen03) {
            if (d.usia < dosenMuda.usia) {
                dosenMuda = d;
            }
        }

        System.out.println("\n========== DOSEN PALING MUDA ==========");
        dosenMuda.cetakInfo();
    }
}