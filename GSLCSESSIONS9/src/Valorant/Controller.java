package Valorant;

public class Controller extends Agent implements show{

	private String cName;
	private int cKill;
	
	public Controller(String mode, int money, String gun, String shield, String type, String cName, int cKill) {
		super(mode, money, gun, shield, type);
		this.cName = cName;
		this.cKill = cKill;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcKill() {
		return cKill;
	}

	public void setcKill(int cKill) {
		this.cKill = cKill;
	}

	@Override
	public void viewagent() {

		System.out.println("=============================================");
		System.out.println("Mode				:" + this.getMode());
		System.out.println("Money				:" + this.getMoney());
		System.out.println("Gun				:" + this.getGun());
		System.out.println("Shield				:" + this.getShield());
		System.out.println("Type				:" + this.getType());
		System.out.println("Agent Name			:" + this.cName);
		System.out.println("Amount of Kill			:" +this.cKill);
		
	}

	
}
