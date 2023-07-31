package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }

    public static void main (String[]args){
        TriangleSidesValidator tsv = new TriangleSidesValidator();
        tsv.validate(1, 7, 4);
    }

    //Create a program that will consume 3 points as method arguments
    //and will print to the console if those points can build up a valid triangle or not.
    //(output when correct: "this is a valid triangle", otherwise : "it's not a triangle")
}
