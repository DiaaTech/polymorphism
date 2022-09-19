package com.diaatech;

public class SPU implements DeliveryDriver{
double rate;
	@Override
	public void calculateRate(double distance, int weight) {
		
			if( distance >= 4 ) {
				rate= (weight * 0.0050) * distance;
			}
			else if(distance<=2 && distance >=1) {
				rate = (weight * 0.050) * distance;
			}
			else {
					 rate = (weight * 0.075) * distance;
			System.out.print(rate);
		}
		}
		
	}



