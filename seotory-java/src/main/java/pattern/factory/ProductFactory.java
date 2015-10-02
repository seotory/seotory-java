package pattern.factory;

/**
 * Created by zion437 on 2015. 10. 2..
 */
public class ProductFactory {
    public static Product getProduct(String type, String name, int price) {
        if ( "ticket".equals(type) )
            return new Ticket(name, price);
        else if ( "computer".equals(type) )
            return new Computer(name, price);
        return null;
    }
}
