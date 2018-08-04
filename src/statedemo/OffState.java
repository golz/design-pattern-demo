package statedemo;

public class OffState extends LampuState {
	private static OffState instance = new OffState();
	
	private OffState() {}
	
	public static OffState instance() { return instance; }
	
	@Override
	public LampuState nextState() {
		System.out.println("lampu nyala");
		return OnState.instance();
	}

}
