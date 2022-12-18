package Valorant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in); // Scanner for input
	ArrayList<Agent> agentData = new ArrayList<>(); // Array List to store Valorant Agent data
	
	public void Menu() {
		
		int choose;
		
		do {
			
			showMenu(); // Show Menu Screen
			choose = scan.nextInt(); // Input number for accessing menu
			scan.nextLine();
			
			switch(choose) {
			
			case 1:
				viewAgent(); // View all Agent data
				break;
			case 2:
				addAgent(); // Making and adding Agent data
				break;
			case 3:
				deleteAgent(); // Delete Agent data
				break;
			case 4:
				scan.close(); // Close program
				System.exit(0);
			default:
				Menu();
				break;
			}
		} while(choose != 5);
	}
	
	public void showMenu() {
		
		// Menu Screen
		System.out.println("Valorant Agent");
		System.out.println("==============");
		System.out.println("1. View Agent");
		System.out.println("2. Add New Agent");
		System.out.println("3. Delete Agent");
		System.out.println("4. Exit");
		System.out.println("Choose [1-4]:");
	}
	
	
	public void viewAgent() {
		
		if(agentData.isEmpty()) {
			
			// If system check no data in 'agentData' display no data found
			System.out.println("No Agent Data is Available!");
			System.out.println("===========================");
			System.out.println("Press Enter to Continue!");
			scan.nextLine();
		}
		
		// Searching data in class Agent of 'agentData'
		for(Agent data: agentData) {
			
			// Increase index 1 for each data inside 'agentData'
			System.out.println("No. " + (agentData.indexOf(data) + 1));
			
			// Data of Controller
			if(data instanceof Controller) {
				((Controller)data).viewagent(); // type cast 'Controller' to data
				System.out.println(" ");
			}
			
			// Data of Duelist
			else if(data instanceof Duelist) {
				((Duelist)data).viewagent();// type cast 'Duelist' to data
				System.out.println(" ");
			}
			
			// Data of Initiator
			else if(data instanceof Initiator) {
				((Initiator)data).viewagent(); // type cast 'Initiator' to data
				System.out.println(" "); 
			}
			
			// Data of Sentinel
			else if(data instanceof Sentinel) {
				((Sentinel)data).viewagent(); // type cast 'Sentinel' to data
				System.out.println(" ");
			}
			
			// Data of Droid
			else if(data instanceof Droid) {
				((Droid)data).viewagent(); // type cast 'Droid' to data
				System.out.println(" ");
			}
		}
	}
	
	
	public void addAgent() {
		
		String mode; // Selecting Gamemode of Valorant
		int money; // Money to buy ability and gun and shield
		String gun; // Choosing which gun class you want
		String shield; // Choose amount of shield to purchase
		String type; // Type of Valorant agent class
		
		String cName; // Controller Name
		int cKill; // Kill Counter for Controller
		
		String dName; // Duelist Name
		int dKill; // Kill Counter for Duelist
		
		String iName; // Initiator Name
		int iKill; // Kill Counter for Initiator
		
		String sName; // Sentinel Name
		int sKill; // Kill Counter for Sentinel
		
		String drName; // Droid Name
		
		// Title for 'addAgent' menu
		System.out.println("Insert New Agent");
		System.out.println("================");
		
		// Input String mode 
		do {
			System.out.println("Input Gamemode to Play [Unrated | Competitive]: ");
			mode = scan.nextLine();
		} while(!(mode.contains("Unrated") || mode.contains("Competitive")));
		
		// Input int money 
		do {
			System.out.println("Select the Amount of Money [800-9000]: ");
			money = scan.nextInt();
			scan.nextLine();
		} while(money < 800 || money > 9000);
		
		// Input String gun
		do {
			System.out.println("Select Gun to Use [Sidearms | Rifle | Sniper | SMG | LMG | Shotgun]: ");
			gun = scan.nextLine();
		} while(!(gun.contains("Sidearms") || gun.contains("Rifle") || gun.contains("Sniper") || gun.contains("SMG") || gun.contains("LMG") || gun.contains("Shotgun")));
		
		// Input String shield
		do {
			System.out.println("Select the Amount of Shield [25 | 50]: ");
			shield = scan.nextLine();
		} while(!(shield.contains("25") || shield.contains("50")));
		
		// Input String type
		do {
			System.out.println("Select Agent Class [Controller | Duelist | Initiator | Sentinel | Droid]: ");
			type = scan.nextLine();
		} while(!(type.contains("Controller") || type.contains("Duelist") || type.contains("Initiator") || type.contains("Sentinel") || type.contains("Droid")));
		
		
		// Alternatif if Choosing Controller
		if(type.contains("Controller")) {
			
			// Input String Name for Controller
			do {
				System.out.println("Input Agent Name [Astra | Brimstone | Harbor | Omen | Viper]: ");
				cName = scan.nextLine();
			} while(!(cName.contains("Astra") || cName.contains("Brimstone") || cName.contains("Harbor") || cName.contains("Omen") || cName.contains("Viper")));
			
			// Input int Kill for Controller
			do {
				System.out.println("Total Kill in that Round [1-5]: ");
				cKill = scan.nextInt();
				scan.nextLine();
			} while(cKill < 1 || cKill > 5);
			
			// Add data into Array List
			Agent newAgent = new Controller(mode, money, gun, shield, type, cName, cKill);
			agentData.add(newAgent);
		}
		
		// Alternatif if Choosing Duelist
		else if(type.contains("Duelist")) {
			
			// Input String Name for Duelist
			do {
				System.out.println("Input Agent Name [Jett | Neon | Phoenix | Raze | Reyna | Yoru]: ");
				dName = scan.nextLine();
			} while(!(dName.contains("Jett") || dName.contains("Neon") || dName.contains("Phoenix") || dName.contains("Raze") || dName.contains("Reyna") || dName.contains("Yoru")));
			
			// Input int Kill for Duelist
			do {
				System.out.println("Total Kill in that Round [1-5]: ");
				dKill = scan.nextInt();
				scan.nextLine();
			} while(dKill < 1 || dKill > 5);
			
			// Add data into Array List
			Agent newAgent = new Duelist(mode, money, gun, shield, type, dName, dKill);
			agentData.add(newAgent);
		}
		
		// Alternatif if Choosing Initiator
		else if(type.contains("Initiator")) {

			// Input String Name for Initiator			
			do {
				System.out.println("Input Agent Name [Breach | Fade | Kayo | Skye | Sova]: ");
				iName = scan.nextLine();
			} while(!(iName.contains("Breach") || iName.contains("Fade") || iName.contains("Kayo") || iName.contains("Skye") || iName.contains("Sova")));
			
			// Input int Kill for Initiator
			do {
				System.out.println("Total Kill in that Round [1-5]: ");
				iKill = scan.nextInt();
				scan.nextLine();
			} while(iKill < 1 || iKill > 5);
			
			// Add data into Array List
			Agent newAgent = new Initiator(mode, money, gun, shield, type, iName, iKill);
			agentData.add(newAgent);
		}
		
		// Alternatif if Choosing Sentinel
		else if(type.contains("Sentinel")) {
			
			// Input String Name for Sentinel	
			do {
				System.out.println("Input Agent Name [Chamber | Cypher | Killjoy | Sage]: ");
				sName = scan.nextLine();
			} while(!(sName.contains("Chamber") || sName.contains("Cypher") || sName.contains("Killjoy") || sName.contains("Sage")));
			
			// Input int Kill for Sentinel
			do {
				System.out.println("Total Kill in that Round [1-5]: ");
				sKill = scan.nextInt();
				scan.nextLine();
			} while(sKill < 1 || sKill > 5);
			
			// Add data into Array List
			Agent newAgent = new Sentinel(mode, money, gun, shield, type, sName, sKill);
			agentData.add(newAgent);
		}
		
		// Alternatif if Choosing Droid
		else if(type.contains("Droid")) {
			
			// Input String Name for Droid
			do {
				System.out.println("Input Droid Name [3-10]:");
				drName = scan.nextLine();
			} while(drName.length() < 3 || drName.length() > 10);
			
			// Add data into Array List
			Agent newAgent = new Droid(mode, money, gun, shield, type, drName);
			agentData.add(newAgent);
		}
		
		System.out.println("Press Enter to Continue!");
		scan.nextLine();
	}
	
	
	public void deleteAgent() {
		
		// int index for inputing which one to delete
		int index;
		
		// Show 'viewAgent' if empty
		if(agentData.isEmpty()) {
			viewAgent();
		}
		
		else {
			
			viewAgent();
			
			// Input which data index to be delete
			do {
				System.out.println("Choose Agent to be Removed: ");
				index = scan.nextInt();
				scan.nextLine();
			} while(index < 1 || index > agentData.size());
			
			// Deleting data
			agentData.remove(index-1);
		}
		
	}
	
	
	public Main() {
		Menu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
