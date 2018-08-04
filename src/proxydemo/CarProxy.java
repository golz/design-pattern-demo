package proxydemo;

public class CarProxy extends Vehicle {

	private Car car;
	
	public CarProxy(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void drive() {
		if(driver.getAge() < 17){ 
			System.out.println("belum boleh");
			return;
		}
		car.drive();
	}

}
