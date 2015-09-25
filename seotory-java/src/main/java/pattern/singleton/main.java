package pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class main {
	
	static EagerInitialization instance = EagerInitialization.getInstance();
	//static BillPushInitializtion instance = BillPushInitializtion.getInstance();
	
	public static void main(String[] args) throws Exception {
		InitializationOnDemandHolderIdiom instance = InitializationOnDemandHolderIdiom.getInstance();
//		EagerInitialization instance22 = EagerInitialization.getInstance();
//		EagerInitialization instance24 = EagerInitialization.getInstance();
//		StaticBlockInitalization instance33 = StaticBlockInitalization.getInstance();
//		StaticBlockInitalization instance34 = StaticBlockInitalization.getInstance();
//		SerializedInitializtion instance = SerializedInitializtion.getInstance();
		
//		String filepath = "d:/test.ser";
//		
//		ObjectOutput out = new ObjectOutputStream(new FileOutputStream( filepath ));
//		out.writeObject(instance);
//		out.close();
//		
//		ObjectInput in = new ObjectInputStream(new FileInputStream( filepath ));
//		SerializedInitializtion instance2 = (SerializedInitializtion)in.readObject();
//		
//		System.out.println( instance.hashCode() );
//		System.out.println( instance2.hashCode() );
		synchronized (java.lang.Object.class) {
	        System.out.println("===========µð¹ö±ë ½ÃÀÛÇß´Ù~================");
	        System.out.println("time:"
	                + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
	        System.out.print(new Throwable().getStackTrace()[0].getClassName() + "."
	                + new Throwable().getStackTrace()[0].getMethodName() + "()");
	        System.out.println("  line: " + new Throwable().getStackTrace()[0].getLineNumber());
	        //System.out.println(something);
	        System.out.println("===========µð¹ö±ë ³¡³µ´Ù~================");
	    }
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
