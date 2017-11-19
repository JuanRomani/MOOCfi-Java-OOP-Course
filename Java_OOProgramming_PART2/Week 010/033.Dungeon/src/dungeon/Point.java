package dungeon;

public abstract class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy){
        if(this.x + dx >= 0){
            this.x = this.x + dx;
        }

        if(this.y + dy >= 0){
            this.y = this.y + dx;
        }
    }

    public String toString(){
        return "" + this.x + " " + this.y;
    }

    public abstract String getPoint();

}
