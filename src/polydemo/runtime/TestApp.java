package polydemo.runtime;

public class TestApp 
{
	public static void main(String[] args) 
	{
		VehicleStore vehicle1 = new TWVehicle();
		vehicle1.getSpecification(vehicle1);
		
		
		vehicle1 = new LMVVehicle();
		vehicle1.getSpecification(vehicle1);

		
		vehicle1 = new HMVVehicle();
		vehicle1.getSpecification(vehicle1);

	}
}
