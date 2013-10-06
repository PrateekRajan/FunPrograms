package FactoryDesignPattern;

public class FurToy implements Toy {

	@Override
	public void shape() {
		System.out
				.println("This is shape from FurToy Class whose shape is Oval");
	}

	@Override
	public void price() {
		System.out
				.println("This is price from FurToy Class whose price is $15");
	}

	@Override
	public void ageGroup() {
		System.out
				.println("This is ageGroup from FurToy Class whose ageGroup is 5-10");
	}

}
