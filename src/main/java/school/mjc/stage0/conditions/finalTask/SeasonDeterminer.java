package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {

        var result = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Wrong month number";
        };

        System.out.println(result);
    }

    public static void main(String[] args) {
        SeasonDeterminer sd = new SeasonDeterminer();
        sd.tellTheSeason(0);
    }

    //Implement the program that will print the season name to the console by the number of the month.
    // If month is incorrect -> print "Wrong month number".
    //Month will be passed as the method argument. (Example: "1" -> "Winter", 0 -> "Wrong month number")
}
