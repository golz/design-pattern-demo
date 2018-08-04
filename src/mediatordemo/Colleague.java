package mediatordemo;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public abstract void sendMessage(String message);
	public abstract void retreiveMessage(Object message);
}
