package polydemo.runtime;

public class VehicleStore 
{
	public void getSpecification(VehicleStore vehicle)
	{
		if(vehicle instanceof TWVehicle) 
		{
			TWVehicle tw = (TWVehicle)vehicle;
			tw.getSpecification();
		}else if(vehicle instanceof LMVVehicle) 
		{
			LMVVehicle lmv = (LMVVehicle)vehicle;
			lmv.getSpecification();
		}else if(vehicle instanceof HMVVehicle) 
		{
			HMVVehicle hmv = (HMVVehicle)vehicle;
			hmv.getSpecification();
		}
	}
}
