
public class Leader extends Member{
	//instance
	private double lengthOfService;

	//default constructor
	public Leader() {
		super();
		setLengthOfService(0);
	}
	
	public Leader(String name, int id, double service) {
		super(name, id);
		setLengthOfService(service);
	}
	
	public double getLengthOfService() {
		return this.lengthOfService;
	}
	
	
	
	public void setLengthOfService(double service) {
		if(service < 2) {
			this.lengthOfService = service;
		} else {
			System.out.println("ERROR in creating leader " + getName() +": Please put in a length of service less than 2 years \n");
		}
	}
	
	public void changeLengthOfService(double service) {
		this.lengthOfService = service;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Length of service: " + getLengthOfService() + " ";
	}
	
}
