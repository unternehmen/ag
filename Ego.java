import java.util.Scanner;

class Ego implements Fighter {
	private int health;
	private int power;
	private boolean boosted;
	
	public Ego() {
		this.health = 10;
		this.power = 4;
		this.boosted = false;
	}
	
	public void respondToAttack(int power) {
		if (power >= health / 2) {
			System.out.println("You scream!  You nearly died!");
		} else {
		    System.out.println("You grunt, but take the damage.");
		}
	}
	
	public void respondToHeal() {
		System.out.println("\"Soothes me!\" quoth ye.");
	}
	
	public void respondToVictory() {
		System.out.println("You wipe off the sweat and take a break.");
	}
	
	public void performTurn(Fighter opponent) {
		Scanner scanner;
		String input;
		boolean chosen;
		
		scanner = new Scanner(System.in);
		
		chosen = false;
		while (!chosen) {
			System.out.println("[Enemy: " + opponent.getName() + "]");
			System.out.println("[Your HP:" + health + "] What now?");
			System.out.println("1. Slice with Grim Nail.");
			System.out.println("2. Eat a Spicy Leaf.");
			System.out.println("3. Give up.");
			
			input = scanner.nextLine();
			
			if (input.equals("1")) {
				System.out.println("The dark blade swings...");
			
				opponent.takeDamage(boosted ? power * 3 : power);
			
				if (boosted) {
					System.out.println("You feel calmed down now.");
					boosted = false;
				}
				
				chosen = true;
			} else if (input.equals("2")) {
				System.out.println("You chew the leaf and feel great!");
				boosted = true;
				chosen = true;
			} else if (input.equals("3")) {
				System.out.println("You decide it's futile...");
				health = 0;
				chosen = true;
			}
		}
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	public void takeDamage(int power) {
		health -= power;
		respondToAttack(power);
	}
	
	public String getName() {
		return "Yourself";
	}
}
