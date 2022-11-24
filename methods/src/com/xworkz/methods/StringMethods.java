package com.xworkz.methods;

public class StringMethods {

	public static void main(String[] args) {

		String ref1 = "String";
		System.out.println(ref1);
		System.out.println("==================");
		ref1 = ref1 + " Methods";
		String ref2 = ref1.concat(" Only");
		System.out.println(ref2);
		System.out.println("==================");

		char ref3 = ref1.charAt(3);
		System.out.println(ref3);
		System.out.println("==================");

		int ref4 = ref1.codePointAt(2);
		System.out.println(ref4);
		System.out.println("==================");

		int ref5 = ref1.codePointBefore(5);
		System.out.println(ref5);
		System.out.println("==================");
		
		int ref6 = ref1.codePointCount(3, 6);
		System.out.println(ref6);
		System.out.println("==================");

		int ref7 = ref2.compareTo(ref1);
		System.out.println(ref7);
		System.out.println("==================");

		boolean ref8 = ref1.contains("When");
		System.out.println(ref8);
		System.out.println("==================");

		boolean ref9 = ref1.contentEquals("Hey buddy");
		System.out.println(ref9);
		System.out.println("==================");

		boolean ref10 = ref1.endsWith("Buddy");
		System.out.println(ref10);
		System.out.println("==================");

		int ref11 = ref1.hashCode();
		System.out.println(ref11);
		System.out.println("==================");

		int ref12 = ref1.indexOf(4);
		System.out.println(ref12);
		System.out.println("==================");

		String ref13 = ref1.intern();
		System.out.println(ref13);
		System.out.println("==================");

		boolean ref14 = ref1.isEmpty();
		System.out.println(ref14);
		System.out.println("==================");

		int ref15 = ref1.lastIndexOf(6);
		System.out.println(ref15);
		System.out.println("==================");

		boolean ref16 = ref1.matches("Hey buddy");
		System.out.println(ref16);
		System.out.println("==================");

		String ref17 = ref1.replace('H', 'e');
		System.out.println(ref17);
		System.out.println("==================");

		int ref18 = ref1.length();
		System.out.println(ref18);
		System.out.println("==================");

		String ref19 = ref1.replace("Buddy", "Dude");
		System.out.println(ref19);
		System.out.println("==================");

		String ref20 = ref1.replaceAll("Buddy","Dude");
		System.out.println(ref20);
		System.out.println("==================");

		boolean ref21 = ref1.startsWith("E");
		System.out.println(ref21);
		System.out.println("==================");

		boolean ref22 = ref1.startsWith("Hey", 0);
		System.out.println(ref22);
		System.out.println("==================");

		char[] ref23 = ref1.toCharArray();
		System.out.println(ref23);
		System.out.println("==================");

		String ref24 = ref1.toLowerCase();
		System.out.println(ref24);
		System.out.println("==================");

		String ref25 = ref24.toUpperCase();
		System.out.println(ref25);
		System.out.println("==================");

	}

}
