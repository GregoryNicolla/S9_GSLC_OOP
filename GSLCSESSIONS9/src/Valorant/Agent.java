package Valorant;

public class Agent {

	// All declaration of data type
	// Using encapsulation so the data type can only be access in here
	private String mode; 
	private int money; 
	private String gun;
	private String shield;
	private String type;
	
	public Agent(String mode, int money, String gun, String shield, String type) {
		
		// this reference
		super();
		this.mode = mode;
		this.money = money;
		this.gun = gun;
		this.shield = shield;
		this.type = type;
	}

	// getter setter for data type
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getGun() {
		return gun;
	}

	public void setGun(String gun) {
		this.gun = gun;
	}

	public String getShield() {
		return shield;
	}

	public void setShield(String shield) {
		this.shield = shield;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}
