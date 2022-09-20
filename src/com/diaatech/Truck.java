package vehicle;

public class Truck implements Vehicle{
double toll;
	@Override
	public void calculatetolls(double weight, double distance) {

			double toll = weight * distance; 
			
			System.out.println(toll);

	}
}
