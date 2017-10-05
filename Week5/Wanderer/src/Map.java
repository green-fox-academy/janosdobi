public class Map {

    int [][] walls;
    int tilesX;
    int tilesY;
    int level;

    public Map (int level) {
        this.level = level;
        tilesX = 10;
        tilesY = 11;
        walls = new int[][]{{3, 0}, {3, 1}, {3, 2}, {2, 2}, {1, 2}, {5, 0}, {5, 1}, {5, 2}, {5, 3}, {5, 4}, {7, 1}, {8, 1}, {7, 2}, {8, 2},
                {0, 4}, {1, 4}, {2, 4}, {3, 4}, {6, 4}, {7, 4}, {8, 4}, {1, 5}, {3, 5}, {8, 5}, {1, 6}, {3, 6}, {5, 6}, {6, 6}, {8, 6},
                {5, 7}, {6, 7}, {8, 7}, {1, 8}, {2, 8}, {3, 8}, {8, 8}, {3, 9}, {5, 9}, {6, 9}, {8, 9}, {1, 10}, {3, 10}, {5, 10}};
    }

    public boolean isItaWall(int posX, int posY) {
        for (int i = 0; i < walls.length; i++) {
            if (walls[i][0] == posX && walls[i][1] == posY) {
                return true;
            }
        }
        return false;
    }

}
