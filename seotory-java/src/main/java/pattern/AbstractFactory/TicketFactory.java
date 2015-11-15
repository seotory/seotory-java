package pattern.abstractFactory;

/**
 * Created by zion437 on 2015. 10. 4..
 */
public class TicketFactory implements ProductAbstractFactory {
    private String name;
    private int price;

    public TicketFactory (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product createProduct() {
        return new Ticket(name, price);
    }
}
