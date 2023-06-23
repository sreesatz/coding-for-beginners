package com.citi.demo.day2;

public class RailwayBerthDemo {
	
	public static void main(String[] args) {
		
		int berthNumber = 45; //FEED YOUR BERTH NUMBER HERE
		String berthtype = ""; // lower, middle, upper, su, sl
		
	 if (berthNumber >= 1 && berthNumber <=72)
	 {	 
		 if(berthNumber %8==1 || berthNumber %8==4) {
			 berthtype = "Lower";
		 }else if (berthNumber %8==2 || berthNumber %8==5) {
			 berthtype = "middle";
		 }else if (berthNumber %8==3 || berthNumber %8==6) {
			 berthtype = "upper";
		 }else if (berthNumber %8==7) {
			 berthtype = "SU";
		 }else if (berthNumber %8==8) {
			 berthtype = "SL";
	}else {
		System.out.println("Invalid Berth Number!");
	}

}
	 System.out.println(berthtype);
	 System.out.println(berthNumber);
	
	
	}
}