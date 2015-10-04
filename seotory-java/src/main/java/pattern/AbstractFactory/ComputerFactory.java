package pattern.AbstractFactory;

/**
 * Created by zion437 on 2015. 10. 4..
 */
public class ComputerFactory implements ProductAbstractFactory {
    private String name;
    private int price;
    public ComputerFactory(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Product createProduct() {
        return new Computer(name, price);
    }
}
