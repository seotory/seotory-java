package pattern.factory;

/**
 * Created by zion437 on 2015. 10. 2..
 */
public abstract class Product {
    public abstract String getName();
    public abstract int getPrice();

    @Override
    public String toString() {
        return "product name : " + getName() + ", price :" + getPrice();
    }
}