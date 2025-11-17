import java.util.*;
import java.util.stream.*;

public class ProductFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mouse", 350));
        products.add(new Product("Keyboard", 1200));
        products.add(new Product("Headset", 900));
        products.add(new Product("Monitor", 7200));

        System.out.print("Enter price filter: ");
        double priceLimit = sc.nextDouble();

        long count = products.stream()
                .filter(p -> p.price > priceLimit)
                .count();

        System.out.println(
            "Number of products more expensive than " + priceLimit + ": " + count
        );
    }
}
