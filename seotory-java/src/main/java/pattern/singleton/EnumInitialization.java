package pattern.singleton;

public enum EnumInitialization {
	INSTANCE;
	
	public static EnumInitialization doSomething() {
		return INSTANCE;
	}
}
