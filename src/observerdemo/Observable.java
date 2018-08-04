package observerdemo;

import java.util.Vector;

public abstract class Observable {
	protected Vector<Observer> observers = new Vector<Observer>();
	
	public void attach(Observer obs){
		observers.add(obs);
	}
	
	public void detach(Observer obs){
		observers.remove(obs);
	}
	
	public void notifyAllObservers(Object message){
		for(Observer obs : observers){
			obs.update(message);
		}
	}
	
}
