//import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		
//		Scanner myScanner = new Scanner(System.in);
//		
//		System.out.println("Number of organizations to add: ");
//		int numOfOrgs = myScanner.nextInt();
//		
//		for(int i = 0; i < numOfOrgs; ++i) {
//			System.out.print("Enter organization name: ");
//			String orgName = myScanner.nextLine();
//			System.out.print("Enter leader name: ");
//			String leaderName = myScanner.nextLine();
//		}
//		
//		System.out.println("Number of Members ")
		
		System.out.println("***CREATING ERRORS***");
		
		//New Leader 
		Leader Cam = new Leader("Cam", 1, 50);
		
		//New Clubs
		Org NHS = new Org("NHS", Cam);
		Org biomedicalOrg = new Org("Biomedical Club", Cam);
		Org newOrg = new Org("Fake Org", Cam);
		
		
		System.out.println("Showing print method with errors");
		System.out.println("*********************");

		//Members of clubs 
		Member Kate = new Member("Kate", 2);
		Member Patricia = new Member("Patricia", 3);
		Member Olivia = new Member("Olivia", 4); //Need to validate the id
		
		//Adding club members 
		NHS.addMember(Olivia);
		NHS.addMember(Patricia);
		NHS.addMember(Kate);
		
		biomedicalOrg.addMember(Olivia);
		biomedicalOrg.addMember(Patricia);
		biomedicalOrg.addMember(Cam);
		
		
		NHS.OrgDetails();
		biomedicalOrg.OrgDetails();
		newOrg.OrgDetails();
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		
		System.out.println("***RESOLVING ERRORS***");
		//Calling change length of service method 
		Cam.changeLengthOfService(1.5);
		biomedicalOrg.changeLeader(new Leader("Ariana", 4, 1));
		newOrg.changeLeader(new Leader("Emma", 7, 0.5));
		newOrg.addMember(Olivia);
		newOrg.addMember(Cam);
		newOrg.addMember(Patricia);
		
		
		NHS.OrgDetails();
		biomedicalOrg.OrgDetails();
		newOrg.OrgDetails();
	}	
}
