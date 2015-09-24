package pattern.singleton;

public class StaticBlockInitalization {
	// private static 으로 객체를 선언한다.
	// instance 는 
	private static StaticBlockInitalization instance;
	private StaticBlockInitalization () {}
	
	static {
		try {
			System.out.println("instance create..");
			instance = new StaticBlockInitalization();
		} catch (Exception e) {
			throw new RuntimeException("Exception creating StaticBlockInitalization instance.");
		}
	}
	
	public static StaticBlockInitalization getInstance () {
		return instance;
	}
	
	public void print () {
		System.out.println("It's print() method in StaticBlockInitalization instance.");
		System.out.println("instance hashCode > " + instance.hashCode());
	}
	
}
