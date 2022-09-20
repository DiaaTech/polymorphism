package diaatech;

public class PostalService implements DeliveryDriver {
	double rate;
	@Override
	
	public void calculateRate(double distance, int weight) {
		
		double rate = weight * distance;
		
		System.out.println(rate);
		
	}
}
