package EnumerationsExamples;


enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumerationsExample3 {
    public static void main(String args[]) {
        WeekDays vishnu= WeekDays.WEDNESDAY;  // vishnu is the object

        if (vishnu == WeekDays.SUNDAY || vishnu == WeekDays.SATURDAY)
            System.out.println("It is Weekend");
        else
            System.out.println("It is weekday: " + vishnu);

    }
}
