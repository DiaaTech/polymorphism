package com.diaatech;

public class Truck  implements Vehicle{
	 double toll;
	int numberOfAxles;
	@Override
	public void calculateToll(double distance) {
		 
		if(numberOfAxles<=2) {
			 toll = 0.040 * distance; 
		 }
		else if(numberOfAxles<=6 && numberOfAxles>=3) {
			toll = 0.045 * distance;
		}
		else {
			toll = 0.048 * distance;
		} 
		  System.out.println(toll);
	}

}
