package observerdemo;

public class PenontonLiveScore implements Observer {

	//
	
	@Override
	public void update(Object message) {
		System.out.println("ada score baru: " + message);
	}

}
