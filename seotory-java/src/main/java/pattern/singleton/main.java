package pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class main {
	
	//static EagerInitialization instance = EagerInitialization.getInstance();
	static BillPushInitializtion instance = BillPushInitializtion.getInstance();
	
	public static void main(String[] args) throws Exception {
		SerializedInitializtion instance = SerializedInitializtion.getInstance();
		
		String filepath = "d:/test.ser";
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream( filepath ));
		out.writeObject(instance);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream( filepath ));
		SerializedInitializtion instance2 = (SerializedInitializtion)in.readObject();
		
		System.out.println( instance.hashCode() );
		System.out.println( instance2.hashCode() );
	}
	
}

class ThreadEx extends Thread {
	
	LazyInitialization instance = LazyInitialization.getInstance();
	
	public ThreadEx (String str) {
		super( str );
	}
	
	public void run() {
		instance.print();
		for ( int i=0 ; i<5 ; i++ ) {
			System.out.println(getName() + " thread! - " + i);			
		}
	}
}
