package pattern.adapter;

/**
 * Created by zion437 on 2015. 11. 8..
 */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
