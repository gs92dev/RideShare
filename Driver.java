/**
 * Your ride-sharing app/taxi driver.
 * 
 * TODO Requirements: 
 * 1. Create a constructor that takes a Vehicle object to store as
 * 	  the instance variable 'vehicle' but you also need a no-argument constructor.
 *    You must have one constructor Driver() and another constructor Driver(Vehicle)
 *
 * 2. Implement the 'drive' method so that it tells the vehicle to drive. Since vehicle has
 *    a drive method, you only need to call this method. This is called the delegation pattern.
 * 
 * 3. The Driver is-a User, so they also have 'name' and 'email' properties. Hint: extend User
 *
 * 4. Ensure this class is properly encapsulated with getters/setters for each field.
 *    Hint: Getters and setters must conform to JavaBean specification. 
 *    Use the Ride class as an example for how to write these methods properly.
 *    You should not have any public variables in this class. All fields must be private.
 */
public class Driver extends User {

	private Driveable vehicle;
	
	public void drive() {
		// drive the vehicle
        System.out.println("Drive");
	}
    public Driver() {
    
    }
      public Driver(Vehicle vehi) {
          this.setVehicle(vehi);
          drive();
    
    }


    public Driveable getVehicle() {
        return vehicle;
    }

    public void setVehicle(Driveable vehicle) {
        this.vehicle = vehicle;
    }
}
