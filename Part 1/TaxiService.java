/**
 *	Operations for our ride sharing application
 *
 * TODO Requirements: 
 * 1. Implement the process method, which creates a new Ride and returns it. 
 *    You need to create a new Ride object, set the driver and passenger fields,
 *    and then return the Ride object.
 * 
 */
public class TaxiService {
	Passenger mario = new Passenger();

	public void setMario(Passenger mario) {
		this.mario = mario;
	}

	Driver beto = new Driver();
	public Ride process(Driver driver, Passenger[] passengers) {
		Ride firstRide = new Ride(driver,passengers);

		return firstRide; // create a Ride and return it
	}
	
}
