package Jobsheet1;

public class funcroyalgraden {

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7}, // store 1
            {6, 11, 9, 12}, // store 2
            {2, 10, 10, 5}, // store 3
            {5, 7, 12, 9} // store 4
        };
        int[] harga = {75000, 50000, 60000, 10000};

        String[] namastore = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        // tabel output
        System.out.printf("%-15s | %-15s | %-15s%n", "Cabang", "Pendapatan (IDR)", "Status");
        System.out.println("-----------------------------------------------------");

        hitung(stok, harga, namastore);
    }

    public static void hitung(int[][] stocks, int[] prices, String[] names) {
        for (int i = 0; i < stocks.length; i++) {
            double income = 0;

            for (int j = 0; j < stocks[i].length; j++) {
                income += stocks[i][j] * prices[j];
            }

            String status;
            if (income > 1500000) {
                status = "Very Good";
            } else {
                status = "Need Evaluation";
            }

            System.out.printf("%-15s | Rp %,12.0f | %-15s%n", names[i], income, status);
        }
    }
}