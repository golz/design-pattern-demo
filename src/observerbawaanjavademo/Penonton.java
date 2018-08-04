package observerbawaanjavademo;

import java.util.Observable;
import java.util.Observer;

public class Penonton implements Observer {

	@Override
	public void update(Observable observable, Object message) {
		System.out.println(observable.toString() + "kirim pesan: " + message.toString());
	}

}
