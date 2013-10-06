package FactoryDesignPattern;

public class ToyFactory {

	Toy toy = null;

	public Toy create(String toyType) {

		if (toyType.equalsIgnoreCase("RubberBall")) {
			return new RubberBall();
		}
		if (toyType.equalsIgnoreCase("FurToy")) {
			return new FurToy();
		}
		if (toyType.equalsIgnoreCase("PlasticToy")) {
			return new PlasticToy();
		}
		return null;
	}

}
