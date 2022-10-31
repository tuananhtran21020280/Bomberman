package uet.oop.bomberman.entities.character.enemy.enemyMove;

import java.util.Random;

public abstract class Move {
	
	protected Random random = new Random();

	public abstract int calculateDirection();
}
