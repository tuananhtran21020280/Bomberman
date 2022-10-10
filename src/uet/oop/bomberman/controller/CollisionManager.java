package uet.oop.bomberman.controller;

import uet.oop.bomberman.controller.Direction.DIRECTION;
import uet.oop.bomberman.entities.Bomb;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Map;
import uet.oop.bomberman.graphics.Sprite;

import java.util.ArrayList;
import java.util.List;

public class CollisionManager {
    private Map map;
    public static final int FIX_WIDTH = 5;
    public static final int FIX_HEIGHT = 4;

    public CollisionManager(Map map) {
        this.map = map;
    }

}
