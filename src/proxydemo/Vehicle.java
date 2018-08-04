package proxydemo;

public abstract class Vehicle {

	protected Human driver;

	public Human getDriver() {
		return driver;
	}

	public void setDriver(Human driver) {
		this.driver = driver;
	}
	
	public abstract void drive();
}
