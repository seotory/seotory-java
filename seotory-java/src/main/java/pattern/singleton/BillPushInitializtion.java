package pattern.singleton;

public class BillPushInitializtion {
	
	private BillPushInitializtion () {}
	private static class Singleton {
		private static final BillPushInitializtion instance = new BillPushInitializtion();
		{
			System.out.println("������.");
		}
	}
	
	public static BillPushInitializtion getInstance () {
		System.out.println("create instance");
		return Singleton.instance;
	}
}
