package EnumerationsExamples;

enum WeekDays {  // enum is the keyword
    SUNDAY, monday, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumerationsExample1 {
    public static void main(String args[]) {
        WeekDays wk; // wk is the object and weekdays is the keyword
        wk = WeekDays.monday; //monday is the constant value
        System.out.println("Today is " + wk);// out is the today is monday
    }
}
