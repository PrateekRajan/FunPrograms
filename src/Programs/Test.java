package Programs;

import java.util.*;

public class Test {
	public static void main(String args[]) {
		int number = 5;
		// @SuppressWarnings("resource")
		// Scanner scan = new Scanner(System.in);
		// int count = 0;
		// double sum = scan.nextDouble();
		// count = scan.nextInt();
		// printLineAverage(sum, count);
		System.out.println(oddFactorial(number));

	}

	public static void printLineAverage(double sum, int count) {
		double average = sum / count;
		System.out.println(average);
	}

	public static int oddFactorial(int number) {

		if (number % 2 == 0) {
			return (0);
		}
		int counter = 1;
		int toReturn = 1;
		while (counter <= number) {
			toReturn = toReturn * counter;
			counter += 2;
		}
		return toReturn;
	}
}