import java.util.Random;
import java.util.Scanner;

public class The_Game {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		character_creation();

	}// Main ends here

	
	/* Code for fight*/ public static void fight() {

		int health=100;
		int enemy = 100;
		int critChance = 5;
		Random rn = new Random();

			int battle = 1;
			
			while(enemy>0){
				
				if (enemy<=0){
					battle=0;
					System.out.println("You won!");
				}
				
				
				else{
					
					System.out.println("Do you want to attack (1), try to dodge (2), or use magic? (3) [Diplay status (4)]");
					int userDecision = input.nextInt();
					
				if (userDecision == 1){
					int hitChance = rn.nextInt(100)+1;
					
						if (hitChance <= (10+critChance)){
						int critDamage = rn.nextInt(25)+1;
						enemy = enemy-10-critDamage;
						System.out.println("you crit the enemy for " + critDamage + " extra damage");
						System.out.println("The enemy is at " +enemy +" health");

					}
					
						else if (hitChance >10 || hitChance < 55){
						enemy=enemy-10;
						
						System.out.println("You hit the enemy for 20 damage!");
						
						System.out.println("The enemy is at " +enemy +" health");

					}
					
						else{
						health= health-20;
						
						System.out.println("The enemy dodged the attack and hit you!");
						
						System.out.println("You are at " +health +" health");
					}
				}
				
					else if (userDecision == 2){
					int dodgeChance = rn.nextInt(100) + 1;
					if (dodgeChance<=45){
						System.out.println("You have successfully dodged his attack!");
						
					}
					else{
						System.out.println("You have taken damage");
						health-=10;
						System.out.println("You are at " +health +" health");
					}
				}
				else if (userDecision == 3){
					int magicChance = rn.nextInt(100) + 1;
						if (magicChance<=30){
						enemy=enemy-10;
						health=health+5;
						System.out.println("You damaged the enemy for 10 and healed for 5 health");

					}
					else if (magicChance<=50 && magicChance>40){
						enemy=enemy-15;
						health=health+10;
						System.out.println("You damaged the enemy for 15 and healed for 10 health");
					}
						else{
						System.out.println("You missed!");
					}

				}
				
				else if (userDecision == 4){
					System.out.println("Your health is "+ health);
					
					System.out.println("Enemy health is "+ health);
				}
				
					
				else{
					System.out.println("You must do something!");
				}
				int enemyHit = rn.nextInt(100) + 1;
				if (enemyHit<70){
					health=health-20;
					System.out.println("You were hit for 20 health");
					System.out.println("You are at " +health +" health");
				}
				else{
					System.out.println("The enemy missed hitting you!");
				}
				if (health<=0){
					battle = 0;
					System.out.println("You are dead");
				}
				
				
				
			}// options else ends
			}// while ends
			

		} //method ends
	
	/* Code for Character Creation*/public static void character_creation() {

		
		
//Save file name
		
		System.out.println("What will be the name of your save file"+"\n");
		String Save_file = input.next();
		
		String char_Loop = "yes";
		String class_type = "k";
		//Character
		while(char_Loop.equalsIgnoreCase("yes")){
		
	
		System.out.println("\n"+"What will your character class be? The options are "+"\n"+"\n"+
		"Mage (Specializes in spell based play, Very hard for beginners: Very Low health, Very Low Defense, Very High Magic Damage, Very Low Physical Damage)"+"\n"+
		"\n"+"Fighter (Specializes in Offensive play, Very Easy for Beginners: Normal health, Normal Defense, High Physical Damage, Very Low Magic Damage)"+"\n"+
		"\n"+"Warrior (Specializes in defensive based play, Normal for beginners: Very High Health, Normal Physical Damage, Low Magic Damage, High Defense)"+"\n"+"\n"+
		"Assassin (Specializes in set ups, Extrememly hard for beginners: Very Low health, Very Low Defense, Very High Magic Damage, Very High Physical Damage)");
		class_type = input.next();
		
		int Health = 0;
		//Very low = 40
		//Low = 50
		//Normal = 60
		// High = 65
		//Very High = 68
		int Phy_Atk = 0;
		//Very low = 5
		//Low = 7
		//Normal = 11
		// High = 17
		//Very High = 20
		int Mag_Atk = 0;
		//Very low = 5
		//Low = 7
		//Normal = 11
		// High = 17
		//Very High = 20
		int Def = 0;
		//Very low = 10
		//Low = 13
		//Normal = 15
		// High = 17
		//Very High = 20
		int Level = 0;
		
		if (class_type.equalsIgnoreCase("mage"))
		{
		Health = 40;
		Phy_Atk = 5;
		Mag_Atk = 20;
		Def = 10;
		Level = 1;
		}
		
		else if (class_type.equalsIgnoreCase("warrior"))
		{
			Health = 68;
			Phy_Atk = 11;
			Mag_Atk = 7;
			Def = 17;
			Level = 1;
		}
		
		else if (class_type.equalsIgnoreCase("fighter"))
		{
			Health = 60;
			Phy_Atk = 17;
			Mag_Atk = 5;
			Def = 15;
			Level = 1;
			
		}
		
		else if (class_type.equalsIgnoreCase("assassin"))
		{
			Health = 40;
			Phy_Atk = 20;
			Mag_Atk = 20;http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=27025
			Def = 10;
			Level = 1;
		}
		
		System.out.println("\n"+"The class you chose was "+ class_type + ". Do you want to choose another class?");
		char_Loop = input.next();
		
		} //character creation while loop ends here
		
		System.out.println("The class you chose was " + class_type);
	}
	
	/* Code for story introduction*/ public static void intro_1(){
		
	}
	
}// Class ends here