package statedemo;

public class OnState extends LampuState {
	private static OnState instance = new OnState();
	
	private OnState() {}
	
	public static OnState instance() { return instance; }
	
	@Override
	public LampuState nextState() {
		System.out.println("lampu mati");
		return OffState.instance();
	}

}
