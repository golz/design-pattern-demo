package singletondemo;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if(null == instance) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public void foo() {
		System.out.println("test");
	}
	
}
