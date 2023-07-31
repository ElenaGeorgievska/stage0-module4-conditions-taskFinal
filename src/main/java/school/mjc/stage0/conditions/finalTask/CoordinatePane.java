package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x == 0 && y == 0){
            System.out.println("zero");
        }else if(x > 0 && y > 0){
            System.out.println("first");
        }else if(x < 0 && y > 0){
            System.out.println("second");
        }else if(x < 0 && y < 0){
            System.out.println("third");
        }else{
            System.out.println("fourth");
        }
    }

    public static void main(String[]args){
        CoordinatePane cp = new CoordinatePane();
        cp.printQuadrant(0, 0);
    }
    // Create a program that will consume 2 integers from method args as data of a coordinate point in a XY coordinate system
    // and determine in which quadrant the coordinate point lies(beginning with top right:"first", "second", "third", "fourth", "zero"):
}
