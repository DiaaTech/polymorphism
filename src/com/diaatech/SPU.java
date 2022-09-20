package diaatech;

public class SPU implements DeliveryDriver{
	double rate;
	@Override
	public void calculateRate(double distance, int weight) {
		if(distance >=5000) {
			rate = (weight * 0.0050) * distance;
		}
		else if(distance <5000 && distance >2000) {
			rate = (weight * 0.050) * distance;
		}
		else {
			rate = (weight * 0.075) * distance;
			
		}	
			System.out.println(rate);
			
		}
	
	}
