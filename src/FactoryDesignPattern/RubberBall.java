package FactoryDesignPattern;

public class RubberBall implements Toy {

	@Override
	public void shape() {
		System.out
				.println("This is shape from RubberBall Class whose shape is Round");
	}

	@Override
	public void price() {
		System.out
				.println("This is price from RubberBall Class whose price is $10");
	}

	@Override
	public void ageGroup() {
		System.out
				.println("This is ageGroup from RubberBall Class whose ageGroup is 10-20");
	}

	public void name() {
		System.out.println("I am rubber Ball");
	}

}
