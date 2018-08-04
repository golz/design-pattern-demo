package observerbawaanjavademo;

import java.util.Observable;

public class LiveScore extends Observable {
	private String score;
	
	public void changeScore(String newScore){
		score = newScore;
		setChanged();
		notifyObservers(score);
	}
}
