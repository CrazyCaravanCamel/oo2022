public class Enemy {
    //paremklõps - refractor - rename
    int coordinateY;
    int coordinateX;

    //new Enemy()
    public Enemy(int worldHeight, int worldWidth) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;
    }

}
