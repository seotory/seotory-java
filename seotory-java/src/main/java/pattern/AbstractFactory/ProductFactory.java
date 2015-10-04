package pattern.AbstractFactory;

/**
 * Created by zion437 on 2015. 10. 4..
 */
public class ProductFactory {
    public static Product getProduct(ProductAbstractFactory product) {
        return product.createProduct();
    }
}
