package com.citi.demo.day2;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		System.out.println("SHOULD I CHANGE MY JOB?");
		
		double currentSalary = 100;
		double offeredSalary = 100;
		
//		> 	>= 	< 	<= 	== 	!= 
		
		if (offeredSalary > currentSalary ) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
