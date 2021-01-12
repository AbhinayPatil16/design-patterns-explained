package per.design.pattern.decorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		
		Car modelX = new ModelX();
		modelX = new Spoiler(modelX);
		modelX = new AlloyWheels(modelX);
		System.out.println("Cost of the fully loaded Model X Car is :"+modelX.cost());

		Car modelY = new ModelY();
		modelY = new AlloyWheels(modelY);
		
		System.out.println("Cost of the Model Y Car with alloy wheels is :"+modelY.cost());

	}

}
