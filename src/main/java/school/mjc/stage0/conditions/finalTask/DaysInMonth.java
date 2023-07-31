package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        var result = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> "invalid date";
        };

        System.out.println(result);

    }

    public static void main(String[] args) {
        DaysInMonth dm = new DaysInMonth();
        dm.printDays(1900, 2);
    }

    //Create a program that will consume a year and a month (validation is required)
    //and will print amount of days in this month considering also if a year is leap or not.
    //(prints amount of days or else "invalid date", negative years are not accepted)
}
