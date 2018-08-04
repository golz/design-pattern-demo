package mediatordemo;

public class User extends Colleague {

	public User(Mediator mediator) {
		super(mediator);
	}
	
	public void sendMessage(String message){
		mediator.sendMessage(this, message);
	}

	@Override
	public void retreiveMessage(Object message) {
		System.out.println( this.toString() + " terima pesan " + message );
	}

}
