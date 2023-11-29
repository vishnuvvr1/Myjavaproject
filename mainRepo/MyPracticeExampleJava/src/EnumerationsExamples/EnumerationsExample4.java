package EnumerationsExamples;


enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumerationsExample4 {
    public static void main(String args[]) {
        Week[] vvr = Week.values();// week[] is the array value

        for (Week weekday : vvr) {   // using for each loop to print all the values

            System.out.println(weekday);
        }
        System.out.println("\n");
        for (int i = 0; i < vvr.length; i++) {  // use for loop also
            System.out.println(vvr[i]);
        }

    }
}


