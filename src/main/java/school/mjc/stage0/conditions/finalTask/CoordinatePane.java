package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0){
            System.out.println("Zero");
        }else if(x > 0 && y > 0){
            System.out.println("First");
        }else if(x < 0 && y > 0){
            System.out.println("Second");
        }else if(x < 0 && y < 0){
            System.out.println("Third");
        }else{
            System.out.println("Fourth");
        }
    }

    public static void main(String[]args){
        CoordinatePane cp = new CoordinatePane();
        cp.printQuadrant(0, 0);
    }
    // Create a program that will consume 2 integers from method args as data of a coordinate point in a XY coordinate system
    // and determine in which quadrant the coordinate point lies(beginning with top right:"first", "second", "third", "fourth", "zero"):
}
