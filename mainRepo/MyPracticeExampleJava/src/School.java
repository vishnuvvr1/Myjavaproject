public class School {
    String name;
    double presentDays;
    double workingDays;
    double fees;

    School(String name, double presentDays, double workingDays, double fees) {
        this.name = name;
        this.presentDays = presentDays;
        this.workingDays = workingDays;
        this.fees = fees;
    }

    public double getdaysPresent() {
        return presentDays;
    }

    public double getworkingDays() {
        return workingDays;
    }

    public double getanualFees() {
        return fees;
    }

    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        return percentage;
    }

    public long calculateannualFee() {
        long annualFee = (long) (fees * 12);
        return annualFee;
    }
}

class Viswasai extends School {
    String studentName;
    boolean condolation;

    Viswasai(String name, double presentDays, double workingDays, double fees, String studentName, boolean condolation) {
        super(name, presentDays, workingDays, fees);
        this.studentName = studentName;
    }

    @Override
    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        if (percentage < 60) {
            condolation = true;
        }
        return percentage;
    }

    @Override
    public long calculateannualFee() {
        long annualFee = (long)fees * 12;
        System.out.println("THE ANNUAL FEES = " + annualFee);
        System.out.println(String.format("%,d", fees));

        return annualFee;
    }

    public void info() {
        System.out.println("SCHOOL NAME : " + name);
        System.out.println("STUDENT NAME : " + studentName);
        System.out.println("SCHOOL WORKING DAYS ARE : " + workingDays);
        System.out.println("NUMBER OF DAYS ATTENDED : " + presentDays);
        System.out.println("YOUR ATTENDANCE PERCENTAGE : " + calculateAttendence());
        double condolationCharges = 1000;
        if (condolation) {
            double totalFees = calculateannualFee() + condolationCharges;
            System.out.println("ANNUAL FEES TO BE PAID : " + totalFees);
        } else {
            System.out.println("ANNUAL FEES TO BE PAID : " + calculateannualFee());
        }
    }

    public static void main(String[] args) {
        Viswasai obj = new Viswasai("Narayana", 150, 365, 10000, "Vishyam Vishnu", false);
        obj.info();
    }
}
