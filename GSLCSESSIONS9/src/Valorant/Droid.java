package Valorant;

public class Droid extends Agent implements show{

	// Additional data type for 'Droid' class
	// Using encapsulation so the data type can only be access in here
	private String drName;
	
	public Droid(String mode, int money, String gun, String shield, String type, String drName) {
		
		// this reference
		super(mode, money, gun, shield, type);
		this.drName = drName;
	}

	// getter setter for additional data type
	
	public String getDrName() {
		return drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	// Printing for 'Droid'
	@Override
	public void viewagent() {
		
		System.out.println("=============================================");
		System.out.println("Mode				:" + this.getMode());
		System.out.println("Money				:" + this.getMoney());
		System.out.println("Gun				:" + this.getGun());
		System.out.println("Shield				:" + this.getShield());
		System.out.println("Type				:" + this.getType());
		System.out.println("Agent Name			:" + this.drName);		
	}
	

}
