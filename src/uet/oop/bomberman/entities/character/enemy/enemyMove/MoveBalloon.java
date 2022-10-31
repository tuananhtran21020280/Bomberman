package uet.oop.bomberman.entities.character.enemy.enemyMove;

public class MoveBalloon extends Move {

	@Override
	public int calculateDirection() {
		// TODO: cài đặt thuật toán tìm đường đi
		return random.nextInt(4);
	}

}
