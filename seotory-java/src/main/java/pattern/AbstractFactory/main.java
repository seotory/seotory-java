package pattern.abstractFactory;

/**
 * Created by zion437 on 2015. 10. 2..
 */
public class main {
    public static void main(String[] args) {
        Product com = ProductFactory.getProduct(new ComputerFactory("com1", 2000));
        Product tk = ProductFactory.getProduct(new TicketFactory("공연", 100000));
        System.out.println( com.toString() );
        System.out.println( tk.toString() );
    }
}
