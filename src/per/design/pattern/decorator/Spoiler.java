package per.design.pattern.decorator;

public class Spoiler implements CarDecorator{

	private Car car;
	
	public Spoiler(Car car) {
		this.car = car;
	}
	
	@Override
	public double cost() {
		return car.cost()+2300;
	}

}
