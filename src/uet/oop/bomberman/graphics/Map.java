package uet.oop.bomberman.graphics;

import uet.oop.bomberman.controller.CollisionManager;
import uet.oop.bomberman.controller.KeyboardEvent;
import uet.oop.bomberman.entities.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
    protected List<List<Entity>> map;
    protected int mapHeight;
    protected int mapWidth;
    public List<Entity> entities = new ArrayList<>();


}
