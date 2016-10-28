class Battle {
	Fighter fighterOne, fighterTwo;
	
	public Battle(Fighter fighterOne, Fighter fighterTwo) {
		this.fighterOne = fighterOne;
		this.fighterTwo = fighterTwo;
	}
	
	public boolean run() {
		Fighter current, opposite, temp;
		
		/* Run the battle. */
		current = fighterOne;
		opposite = fighterTwo;
		while (!current.isDead()) {
			current.performTurn(opposite);
			
			/* In case the fighter's own move killed it. */
			if (current.isDead()) break;
			
			/* Switch the combatants. */
			temp = current;
			current = opposite;
			opposite = temp;
		}
		
		opposite.respondToVictory();
		
		return current != fighterOne;
	}
	
	public static void main(String[] args) {
		new Battle(new Ego(), new Zombie()).run();
	}
}
