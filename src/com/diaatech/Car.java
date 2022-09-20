package vehicle;

public class Car implements Vehicle{
	double toll;
	@Override
		public void calculatetolls(double weight, double distance) {
				
				double toll = (distance * 0.020);
				toll = toll +1.00;
				
					System.out.println(toll);
				}
		
	}

		
	