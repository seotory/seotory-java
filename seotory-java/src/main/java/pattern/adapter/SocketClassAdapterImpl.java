package pattern.adapter;

/**
 * Created by zion437 on 2015. 11. 8..
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    public Volt get120Volt() {
        return getVolt();
    }

    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    public Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
