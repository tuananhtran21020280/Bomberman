package uet.oop.bomberman.entities.character.enemy;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.character.enemy.enemyMove.MoveBalloon;
import uet.oop.bomberman.graphics.Sprite;

public class Balloon extends Enemy {


    public Balloon(int x, int y, Board board) {
        super(x, y, board, Sprite.balloom_dead, 0.3);

        _sprite = Sprite.balloom_left1;

        _Move = new MoveBalloon();
        _direction = _Move.calculateDirection();

    }

    @Override
    protected void chooseSprite() {
        switch(_direction) {
            case 0:
            case 1:
                _sprite = Sprite.movingSprite(Sprite.balloom_right1, Sprite.balloom_right2, Sprite.balloom_right3, _animate, 60);
                break;
            case 2:
            case 3:
                _sprite = Sprite.movingSprite(Sprite.balloom_left1, Sprite.balloom_left2, Sprite.balloom_left3, _animate, 60);
                break;
        }
    }
}
