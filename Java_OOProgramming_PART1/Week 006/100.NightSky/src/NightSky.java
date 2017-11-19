import java.util.Random;

/**
 * Created by Juan Ignacio on 5/7/2017.
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density){
        this.density = density;
        width = 20;
        height = 10;
        starsInLastPrint = 0
    }

    public NightSky(int width, int height){
        density = 0.1;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        starsInLastPrint = 0
    }

    public void printLine(){
        Random rand = new Random();

        for (int i = 0; i < this.width; i++){
            double star = rand.nextDouble();

            if (star < this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }

            System.out.print(" ");
        }
    }

    public void print(){
        for (int i = 0; i < this.height; i++){
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        int last = starsInLastPrint;
        starsInLastPrint = 0;

        return last;
    }
}
