//import java.util.ArrayList;

public class Member extends Person {
	//instance variable
	private int id;
	//private ArrayList<Org> MemOrgs= new ArrayList<>(); 
	//Person can be a member of multiple orgs 
	
	//default
	public Member() {
		super();
		this.id = 0;
	}
	
	public Member(String name, int id) {
		super(name);
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return super.toString() + "ID #: " + getId() + " ";
		
	}
}
