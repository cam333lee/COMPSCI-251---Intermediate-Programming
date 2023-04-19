import java.util.ArrayList;

public class Org {
	//instance
	private String orgName;
	//Possibly make a T/F boolean in Person to see if they are a leader
	//Then can make a getLeader method to see if they are already a leader
	private Leader leader; //single leader of the org 
	private boolean orgLeader = false;
	private ArrayList<Member> members = new ArrayList<>();
	
	//specifying
	public Org(String orgName, Leader leader) {
		setOrgName(orgName);
		setLeader(leader);
	}
	
	public String getOrgName() {
		return this.orgName;
	}
	
	public String getLeaderName() {
		return this.leader.getName();
	}
	
	private void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	private void setLeader(Leader leader) {
		if((leader.isLeader() && this.orgLeader == false)) { //if the person is not a leader and the organization does not have a leader 
			this.orgLeader = true;
			this.leader = leader;
		} else {
			this.leader = new Leader("No Leader Available", 0, 0);
			System.out.println("ERROR in creating " + getOrgName() + " organization: This person is already a leader for another organization. Defaults will be set. Please choose another person who is not a leader. \n");
		}
		
	}
	
	public void changeLeader(Leader leader) {
		this.leader = leader; //assign the leader to this new leader 
	}
//	
//	public boolean equals (Leader guest) {
//		if (guest == null) {
//			return false;
//		}
//		
//		if(this.leader == guest) {
//			return true;
//		}
//		
//		if (!(guest instanceof Leader)) {
//			return false;
//		}
//		
//		return false;
//	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void OrgDetails() {
		System.out.println("Organization Name: " + getOrgName() + '\n');
		System.out.println("Leader Name: " + getLeaderName() + "\t Length of Service: " + this.leader.getLengthOfService() + '\n');
		System.out.println("Members: ");
		for(Member members: members) //Going through all of the members of the org
			System.out.println(members.getName());
		
		System.out.println("");
		System.out.println("*********************");
		
	}
	
}
