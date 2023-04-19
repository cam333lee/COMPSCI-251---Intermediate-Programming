
public class Person {
	
	//instance variable
	private String name; 
	private boolean isLeader; //set leader value t
	
	//default constructor
	public Person() {
		this("No Name"); //idk what to put here except blank
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isLeader() {
		if(this.isLeader == false) { //if the person is not a leader 
			this.isLeader = true; //set the leader variable to true 
			return true;	
		} else {
			return false; //otherwise they are already a leader
		}
		
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " ";
	}
}
//End of person