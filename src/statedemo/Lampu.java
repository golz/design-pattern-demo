package statedemo;

public class Lampu {
	private LampuState currentState;
	
	public Lampu() {
		super();
		this.currentState = OffState.instance();
	}

	public void pencetTombolLampu() {
		currentState = currentState.nextState();
	}
}
