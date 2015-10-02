package pattern.factory;

/**
 * Created by zion437 on 2015. 10. 2..
 */
public class Computer extends Product {
    private String name;
    private int price;

    public Computer (String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    public void toStrig () {
        System.out.println("항목 :: " + this.name + ", 가격 :: "+ this.price);
    }
}
