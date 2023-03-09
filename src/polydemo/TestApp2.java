package polydemo;
public class TestApp2 
{
	public static void main(String[] args) 
	{
//		Vehicle vehicle = new Vehicle();
//		TW tw = new TW();
//		LMV lmv = new LMV();
//		HMV hmv = new HMV();

		// Polymorphic object
//		Vehicle vehicle  = new TW();
//		Vehicle vehicle  = new LMV();
		Vehicle vehicle  = new HMV();

		vehicle.getSpecification();
	}
}