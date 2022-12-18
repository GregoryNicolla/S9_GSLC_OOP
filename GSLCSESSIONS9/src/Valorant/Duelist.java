package Valorant;

public class Duelist extends Agent implements show{

	// Additional data type for 'Duelist' class
	// Using encapsulation so the data type can only be access in here
	private String dName;
	private int dKill;
	
	public Duelist(String mode, int money, String gun, String shield, String type, String dName, int dKill) {
		
		// this reference
		super(mode, money, gun, shield, type);
		this.dName = dName;
		this.dKill = dKill;
	}

	// getter setter for additional data type
	
	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdKill() {
		return dKill;
	}

	public void setdKill(int dKill) {
		this.dKill = dKill;
	}

	// Printing for 'Duelist'
	@Override
	public void viewagent() {
		
		System.out.println("=============================================");
		System.out.println("Mode				:" + this.getMode());
		System.out.println("Money				:" + this.getMoney());
		System.out.println("Gun				:" + this.getGun());
		System.out.println("Shield				:" + this.getShield());
		System.out.println("Type				:" + this.getType());
		System.out.println("Agent Name			:" + this.dName);
		System.out.println("Amount of Kill			:" +this.dKill);		
	}

	
}
