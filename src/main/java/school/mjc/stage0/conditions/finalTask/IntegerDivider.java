package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        double result = dividend / divider;
        //var remainder = (divider - dividend * parseInt(divider / dividend));

        if (dividend / divider == Double.POSITIVE_INFINITY) {
            System.out.println("division by zero");
        } else if (result * divider == dividend && divider != 0) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    public static void main(String[] args) {
        IntegerDivider id = new IntegerDivider();
        id.printCompletelyDivided(25, 5);
    }


//Create a program that will consume 2 integers from method args (dividend and divider)
// and will perform integer division of dividend be divider, save the value,
// and then will multiply result by divider and will if got value is equal to dividend will print:"can be divided completely",
// otherwise "cannot be divided completely" or "division by zero".

//Dividend ÷ Divisor = Quotient.
}


