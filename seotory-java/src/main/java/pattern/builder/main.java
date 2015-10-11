package pattern.builder;

/**
 * Created by zion437 on 2015. 10. 11..
 */
public class main {
    public static void main (String[] args) {
        Product p1 = new Product.ProductBuilder("test상품", 10000).setIsSellEnabled(true).build();
    }
}
