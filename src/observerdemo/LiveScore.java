package observerdemo;

public class LiveScore extends Observable {
	private String score;
	
	public void changeScore(String newScore){
		score = newScore;
		notifyAllObservers(score);
	}
	
}
