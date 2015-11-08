package pattern.adapter;

/**
 * Created by zion437 on 2015. 11. 8..
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
