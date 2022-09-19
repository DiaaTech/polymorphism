package com.diaatech;

public class Car implements Vehicle{
	private static final boolean pullingATrailer = false;
	double toll;
	@Override
	public void calculateToll(double distance) {
	
		if(pullingATrailer) {
			 toll = toll + 1.00;
		}
		else {
		 toll = distance * 0.020;
		}
		  System.out.println(toll);
			   }
		
	}


