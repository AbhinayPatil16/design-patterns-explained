package per.design.pattern.decorator;

public class AlloyWheels implements CarDecorator{

	private Car car;
	
	public AlloyWheels(Car car) {
		this.car = car;
	}
	
	@Override
	public double cost() {
		return car.cost()+5000;
	}

}
