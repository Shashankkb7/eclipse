package com.xworkz.methods;

public class StringMethodRunner {

	public static void main(String[] args) {

		String tripleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println("Split all by space:");
		String[] splits = tripleRide.split(" ");
		for (int triple = 0; triple < splits.length; triple++)
			System.out.println(splits[triple]);
		System.out.println(System.lineSeparator());

		System.out.println("Split by:");
		String[] splitby = tripleRide.split(",");
		for (int triple1 = 0; triple1 < splitby.length; triple1++)
			System.out.println(splitby[triple1]);
		System.out.println(System.lineSeparator());

		System.out.println("Uppercase:");
		String upperCase = tripleRide.toUpperCase();
		System.out.println(upperCase);
		System.out.println(System.lineSeparator());

		System.out.println("Lowercase:");
		String lowerCase = tripleRide.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(System.lineSeparator());

		System.out.println("Convert to characters:");
		char[] characters = tripleRide.toCharArray();
		for (int convert = 0; convert < characters.length; convert++)
			System.out.println(characters[convert]);
		System.out.println(System.lineSeparator());

		System.out.println("Reverse above string:Using build method");
		StringBuilder reverse = new StringBuilder();
		reverse.append(tripleRide);
		reverse.reverse();
		System.out.println(reverse);
		System.out.println(System.lineSeparator());

		System.out.println("Reverse above string:Using loop");
		for (int i = characters.length - 1; i >= 0; i--)
			System.out.print(characters[i]);
		System.out.println(System.lineSeparator());

		System.out.println("Printing duplicate values:");
		int count;
		char[] duplicate = lowerCase.toCharArray();
		for (int i = 0; i < duplicate.length; i++) {
			count = 1;
			for (int j = i + 1; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j] && duplicate[i] != ' ') {
					count++;
					duplicate[j] = '0';
				}
			}
			if (count > 1 && duplicate[i] != '0')
				System.out.print(duplicate[i]);
		}
		System.out.println(System.lineSeparator());

		System.out.println("finding all digits in a string:");
		char[] digit = lowerCase.toCharArray();
		StringBuilder digits = new StringBuilder();
		for (char c : digit) {
			if (Character.isDigit(c)) {
				digits.append(c);
			}
		}
		System.out.println(digits);
		System.out.println(System.lineSeparator());

		System.out.println("Finding R in the above string:");
		char ch = 'r';
		int frequency = 0;
		for (int k = 0; k < lowerCase.length(); k++) {
			if (ch == lowerCase.charAt(k)) {
				++frequency;
			}
		}
		System.out.println("Frequency of " + ch + " = " + frequency);
		System.out.println(System.lineSeparator());

		System.out.println("Checking palindrome in above triple ride");
		StringBuffer palindrome = new StringBuffer(tripleRide);
		palindrome.reverse();
		String data = palindrome.toString();
		if (tripleRide.equals(data)) {
			System.out.println("Given tripleride is palindrome");
		} else {
			System.out.println("Given tripleride is not palindrome");
		}
	}
}
