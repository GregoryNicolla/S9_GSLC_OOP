package Valorant;

public class Sentinel extends Agent implements show{

	// Additional data type for 'Sentinel' class
	// Using encapsulation so the data type can only be access in here
	private String sName;
	private int sKill;
	
	public Sentinel(String mode, int money, String gun, String shield, String type, String sName, int sKill) {
		
		// this reference
		super(mode, money, gun, shield, type);
		this.sName = sName;
		this.sKill = sKill;
	}

	// getter setter for additional data type
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsKill() {
		return sKill;
	}

	public void setsKill(int sKill) {
		this.sKill = sKill;
	}

	// Printing for 'Sentinel'
	@Override
	public void viewagent() {
		
		System.out.println("=============================================");
		System.out.println("Mode				:" + this.getMode());
		System.out.println("Money				:" + this.getMoney());
		System.out.println("Gun				:" + this.getGun());
		System.out.println("Shield				:" + this.getShield());
		System.out.println("Type				:" + this.getType());
		System.out.println("Agent Name			:" + this.sName);
		System.out.println("Amount of Kill			:" +this.sKill);		
	}

	
}
