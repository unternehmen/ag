interface Fighter {
	public void respondToVictory();
	public void performTurn(Fighter opponent);
	public boolean isDead();
	public void takeDamage(int power);
	public String getName();
}
