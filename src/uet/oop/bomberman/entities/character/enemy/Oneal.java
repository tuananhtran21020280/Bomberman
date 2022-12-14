package uet.oop.bomberman.entities.character.enemy;


import uet.oop.bomberman.Board;
import uet.oop.bomberman.entities.character.enemy.enemyMove.MoveOneal;
import uet.oop.bomberman.graphics.Sprite;

public class Oneal extends Enemy {
    //private Random random = new Random();
    public Oneal(int x, int y, Board board) {
        super(x, y, board, Sprite.balloom_dead, 0.6 );

        _sprite = Sprite.balloom_left1;

        _Move = new MoveOneal(_board.getBomber(), this);
        _direction = _Move.calculateDirection();
        //this._speed += random.nextDouble()/2;

    }

    @Override
    protected void chooseSprite() {
        switch(_direction) {
            case 0:
            case 1:
                if(_moving)
                    _sprite = Sprite.movingSprite(Sprite.oneal_right1, Sprite.oneal_right2, Sprite.oneal_right3, _animate, 60);
                else
                    _sprite = Sprite.oneal_left1;
                break;
            case 2:
            case 3:
                if(_moving)
                    _sprite = Sprite.movingSprite(Sprite.oneal_left1, Sprite.oneal_left2, Sprite.oneal_left3, _animate, 60);
                else
                    _sprite = Sprite.oneal_left1;
                break;
        }
    }
}
