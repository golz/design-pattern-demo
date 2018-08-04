package mediatordemo;

import java.util.Vector;

public abstract class Mediator {
	protected Vector<Colleague> colleagues = new Vector<Colleague>();
	
	public void attach(Colleague col){
		colleagues.add(col);
	}
	
	public void detach(Colleague col){
		colleagues.remove(col);
	}
	
	public void sendMessage(Colleague sender, Object message){
		for(Colleague col : colleagues){
			if(col == sender) continue;
			col.retreiveMessage(message);
		}
	}
}
