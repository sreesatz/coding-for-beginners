package com.citi.demo.day2;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		String input = "C"; // AEIOU

		switch (input) {
		case "A":
			System.out.println("Attractive");
			break;
		case "B":
			System.out.println("beautiful");
			break;
		case "C":
			System.out.println("Charming");
			break;
		default:
			System.out.println("Other");
			break;
		}
	}
}