public class EcommerceSearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Keyboard", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Mobile", "Electronics")
        };

        // Sorted array for Binary Search
        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Keyboard", "Electronics")
        };

        int searchId = 104;

        System.out.println("=== Linear Search ===");
        Product result1 =
                SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null) {
            System.out.println("Product Found: " + result1);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("\n=== Binary Search ===");
        Product result2 =
                SearchAlgorithms.binarySearch(sortedProducts, searchId);

        if (result2 != null) {
            System.out.println("Product Found: " + result2);
        } else {
            System.out.println("Product Not Found");
        }
    }
}