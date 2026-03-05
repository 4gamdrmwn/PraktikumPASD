package quiz1;

import java.util.Scanner;

public class accessoriesdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        accessories[] accs = new accessories[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for accessory " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Category: ");
            String category = scanner.nextLine();
            System.out.print("Price: ");
            int price = scanner.nextInt();
            System.out.print("Sold: ");
            int sold = scanner.nextInt();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine();
            
            accs[i] = new accessories(name, category, price, sold, stock);
        }
        
        // Display all accessories
        System.out.println("========================");
        System.out.println("All Accessories:");
        System.out.println("========================");
        System.out.println("");
        for (accessories acc : accs) {
            acc.display();
            System.out.println();
        }
        
        // display calculate total sales
        int totalSales = 0;
        for (accessories acc : accs) {
            totalSales += acc.calculatetotalsales();
        }
        System.out.println("Total Sales: " + totalSales);
        System.out.println("");
        
        // display check stock 1 per 1
        System.out.println("========================");
        System.out.println("Stock Check: ");
        System.out.println("========================");
        System.out.println("");
        for (accessories acc : accs) {
            acc.checkstock();
            System.out.println();
        }
        
        // display cheapest acc
        accessories.searchcheapestaccessories(accs);
        
        scanner.close();
    }
}
