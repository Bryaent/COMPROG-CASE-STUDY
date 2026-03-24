public class Main {
    public static void main(String[] args) {

        Product[] items = {
            new Electronics("Tablet", 10000),
            new Clothing("Jacket", 5000),
            new Food("Pizza", 500),
            new Furniture("Sofa Bed", 30000),
            new Book("ComProg 2", 500)
        };

        for (int i = 0; i < items.length; i++) {
            Product p = items[i];

            System.out.println("--------");
            System.out.println("Type: " + p.getProductType());
            System.out.println("Name: " + p.getItemLabel());
            System.out.println("Price: " + p.getBaseCost());
            System.out.println("Tax: " + p.getTaxPercentage());
            System.out.println("Net Amount: " + p.getNetAmount());
        }
        System.out.println("--------");
    }
}
