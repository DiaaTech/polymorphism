package com.diaatech;

public class PostalService implements DeliveryDriver{

	@Override
	public void calculateRate(double distance, int weight) {
		 double rate = weight * distance;
			System.out.println(rate);
		
	}

}
