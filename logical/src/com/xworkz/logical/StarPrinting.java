package com.xworkz.logical;

public class StarPrinting {

	public static void main(String[] args) {
		System.out.println("printing side by side");
		for (int i = 0; i <= 5; i++) {
			System.out.print(" * ");

			System.out.print(" ");
		}
		System.out.println(" ");

		System.out.println("printing line by line");
		for (int i = 0; i <= 5; i++) {
			System.out.println("*");
		}

		System.out.println("printing Square matrix");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(" @ ");
			}
			System.out.println(" ");
		}

		System.out.println("printing row of numbers");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

		System.out.println("printing row of numbers");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++)
				if (j == 3) {
					System.out.print("d");
				} else {
					System.out.print(i);
				}
			System.out.println(" ");
		}

		System.out.println("printing name in the matrix");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++)
				if (i == 2) {
					System.out.print("shashank ");
				} else {
					System.out.print(i);
				}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" # ");
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		int n = 4;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$ ");
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		n = 4;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(j);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println(" ");
		}

		System.out.println("printing triangle pattern");
		n = 4;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				if (j == 2) {

					System.out.print("shashank");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("shashank");
				} else {
					System.out.print(k);
				}
			}
			System.out.println("");
		}

		System.out.println("printing reverse right angled triangle pattern");
		n = 4;
		// main loop
		for (int i = n; i >= 1; i--) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("%");
			}
			System.out.println(" ");
		}

		System.out.println("printing reverse triangle pattern");
		n = 4;
		// main loop
		for (int i = n; i >= 1; i--) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" %");
			}
			System.out.println(" ");
		}
	}
}
