class Jyesula implements Fighter {
	private int health;
	private int power;
	
	public Jyesula() {
		this.health = 9001;
		this.power = 9001;
	}
	
	public void respondToAttack() {
		System.out.println("Jyesula is only grazed.");
	}
	
	public void respondToHeal() {
		System.out.println("\"Wonderful,\" says Jyesula.");
	}
	
	public void respondToVictory() {
		System.out.println("Jyesula offers you a farming job.");
	}
	
	public void performTurn(Fighter opponent) {
		System.out.println("Jyesula steps toward you.");
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
		return "Jyesula";
	}
}
