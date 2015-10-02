package pattern.factory;

/**
 * Created by zion437 on 2015. 10. 2..
 */
public class Computer extends Product {
    private String name;
    private int price;

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
