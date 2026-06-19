package dsa;

public class LinearSearch {

    public static Product search(Product[] product,String name)
    {
        for(Product pro:product)
        {
            String result=pro.getProductName();
            if(result.equals(name))
            {
                return pro;
            }
        }

        return null;
    }
}
