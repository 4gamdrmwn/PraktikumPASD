package quiz1;

public class accessories {
    private String name, category;
    private int price, sold, stock;
    
    public accessories() {
    }
    
    public accessories(String name, String category, int price, int sold, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Sold: " + sold);
        System.out.println("Stock: " + stock);
    }
    
    public int calculatetotalsales() {
        return sold * price;
    }
    
    public void checkstock() {
        display();
        if (stock > 5) {
            System.out.println("Many stock");
        } else {
            System.out.println("Limited stock");
        }
    }
    
    public static void searchcheapestaccessories(accessories[] accessories) {
        if (accessories.length == 0) return;
        accessories cheapest = accessories[0];
        for (int i = 1; i < accessories.length; i++) {
            if (accessories[i].price < cheapest.price) {
                cheapest = accessories[i];
            }
        }
        System.out.println("Cheapest Accessories: ");
        cheapest.display();
    }
}
