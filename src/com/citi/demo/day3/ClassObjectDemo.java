package com.citi.demo.day3;

public class ClassObjectDemo {
	
		public static void main(String[] args) {

//			int num = 10;

			Employee emp = new Employee();
			emp.work();
			emp.name = "Sonu";
			System.out.println(emp.name);
			Employee emp2 = new Employee();
			emp2.work();
			emp2.name = "Monu";
			System.out.println(emp2.name);

		}
		
	}
