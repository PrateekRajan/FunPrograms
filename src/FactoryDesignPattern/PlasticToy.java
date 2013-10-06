package FactoryDesignPattern;

public class PlasticToy implements Toy {

	@Override
	public void shape() {
		System.out
				.println("This is shape from PlasticToy Class whose shape is Straight");
	}

	@Override
	public void price() {
		System.out
				.println("This is price from PlasticToy Class whose price is $30");
	}

	@Override
	public void ageGroup() {
		System.out
				.println("This is ageGroup from PlasticToy Class whose ageGroup is 15-20");
	}

}
