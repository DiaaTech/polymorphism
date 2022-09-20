package diaatech;

public class FexEd implements DeliveryDriver{
double rate;
	@Override
	public void calculateRate(double distance, int weight) {
		
				if (distance > 500 ) {
			     rate = rate + 5.00;
				}
				else if( weight > 48) {
			        rate = rate + 3.00;
				}
				else {
					rate = 20.00;
				}
				System.out.println(rate);
	}
	

}
