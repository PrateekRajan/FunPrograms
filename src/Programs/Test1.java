package Programs;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input number of lines:");
		int i = 0, j, k, n;
		n = scan.nextInt();

		for (k = 0; k <= n / 2; k++) {
			for (i = 0; i < n - k; i++) {
				System.out.print(" ");
			}
			for (j = 1; j < k; j++) {
				System.out.print("*");
			}
			for (j = 1; j < k - 1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}

		for (k = (n / 2); k <= n; k++) {
			for (i = 0; i < k; i++) {
				System.out.print(" ");
			}
			for (i = 1; i < n - k; i++) {
				System.out.print("*");
			}
			for (j = 0; j < n - k - 2; j++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}

		scan.close();
	}
}