package dsa;

import java.util.*;
public class SearchTest {
    public static void main(String[] args) {
        
        Product[] product={
             new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Mouse","Accessories"),
            new Product(104,"Keyboard","Accessories")
        };

        System.out.println("Linear serach");
        Product result=LinearSearch.search(product,"Phone");
        System.out.println(result.getProductId() +" "+result.getCategory()+" "+result.getProductName());

        System.out.println("Binary Search");
        Arrays.sort(product,Comparator.comparing(Product::getProductName));
        Product result2=BinarySearch.search(product, "Mouse");
        System.out.println(result2.getProductId() +" "+result2.getCategory()+" "+result2.getProductName());


    }
}
