package FactoryDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		ToyFactory obj = new ToyFactory();
		Toy toy = obj.create("rubberBall");
		toy.ageGroup();
		toy.shape();
		toy.price();
		((RubberBall) toy).name();
	}
}
