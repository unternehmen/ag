class Zombie implements Fighter {
	private int health;
	private int power;
	
	public Zombie() {
		this.health = 5;
		this.power = 2;
	}
	
	public void respondToAttack() {
		System.out.println("The zombie's body slugs back at the hit.");
	}
	
	public void respondToHeal() {
		System.out.println("The zombie's wounds are mending!");
	}
	
	public void respondToVictory() {
		System.out.println("The zombie rips open your body.");
	}
	
	public void performTurn(Fighter opponent) {
		System.out.println("The zombie grabs at your flesh.");
		opponent.takeDamage(power);
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	public void takeDamage(int power) {
		health -= power;
		respondToAttack();
	}
	
	public String getName() {
		return "Zombie";
	}
}
