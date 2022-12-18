package Valorant;

public class Initiator extends Agent implements show{

	// Additional data type for 'Initiator' class
	// Using encapsulation so the data type can only be access in here
	private String iName;
	private int iKill;
	
	public Initiator(String mode, int money, String gun, String shield, String type, String iName, int iKill) {
		
		// this reference
		super(mode, money, gun, shield, type);
		this.iName = iName;
		this.iKill = iKill;
	}

	// getter setter for additional data type
	
	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public int getiKill() {
		return iKill;
	}

	public void setiKill(int iKill) {
		this.iKill = iKill;
	}

	// Printing for 'Initiator'
	@Override
	public void viewagent() {
		
		System.out.println("=============================================");
		System.out.println("Mode				:" + this.getMode());
		System.out.println("Money				:" + this.getMoney());
		System.out.println("Gun				:" + this.getGun());
		System.out.println("Shield				:" + this.getShield());
		System.out.println("Type				:" + this.getType());
		System.out.println("Agent Name			:" + this.iName);
		System.out.println("Amount of Kill			:" +this.iKill);		
	}
	

}
