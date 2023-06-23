package com.citi.demo.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
	//	int maths =99;
	//int phy = 100;
	//	int chem = 95;
	//	int eng = 89;
	//	int sans =77;
		
int[] marks = { 99, 87, 92, 95, 98 };
		
		System.out.println("Chemistry");
		System.out.println(marks[2]); // 3rd element - 92
		System.out.println("Maths");
		System.out.println(marks[0]); // 1st element - 99
		System.out.println("All subjects");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(marks[i]);
		}
	}
}

