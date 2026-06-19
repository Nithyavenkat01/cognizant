package dsa;

public class BinarySearch {

    public static Product search(Product[] product,String target) {

        int i=0;
        int j=product.length-1;

        while(i<=j)
        {
            int mid=(i+j)/2;

            int comparision=product[mid].getProductName().compareToIgnoreCase(target);

            if(comparision==0)
            {
                return product[mid];
            }

            if(comparision<0)
            {
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return null;
    }
}
