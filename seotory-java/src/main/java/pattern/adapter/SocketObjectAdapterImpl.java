package pattern.adapter;

/**
 * Created by zion437 on 2015. 11. 8..
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket sock = new Socket();

    public Volt get120Volt() {
        return sock.getVolt();
    }

    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
