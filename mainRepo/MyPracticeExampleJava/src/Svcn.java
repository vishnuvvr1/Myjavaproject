class Svcn extends School {
    String studentName;
    boolean condolation;

    Svcn(String name, double presentDays, double workingDays, double fees, String studentName, boolean condolation) {
        super(name, presentDays, workingDays, fees);
        this.studentName = studentName;
        this.condolation = condolation;
    }

    @Override
    public double calculateAttendence() {
        double percentage = (presentDays / workingDays) * 100;
        if (percentage < 50) {
            condolation = true;
        }
        return percentage;
    }

    @Override
    public long calculateannualFee() {
        long annualFee = (long) (fees * workingDays) / 30;
        return annualFee;

    }

    public String indianRupees(long totalfee) {
        long num = totalfee;
        String str = Long.toString(num);
        char[] ch = str.toCharArray();
        int j = 3;
        int k = 0;
        String str1 = " ";
        for (int i = ch.length - 1; i >= 0; i--) {
            k++;
            str1 = String.valueOf(ch[i]).concat(str1);
            if (k == j) {
                str1 = ",".concat(str1);
                j += 2;
            }
        }
        return str1;
    }

    public void info() {
        System.out.println("SCHOOL NAME : " + name);
        System.out.println("STUDENT NAME : " + studentName);
        System.out.println("SCHOOL WORKING DAYS ARE : " + workingDays);
        System.out.println("NUMBER OF DAYS ATTENDED : " + presentDays);
        System.out.println("YOUR ATTENDANCE PERCENTAGE : " + calculateAttendence());
        System.out.println("school fee : " + fees);
        double condolationCharges = 1500;
        if (condolation) {
            long totalFees = (long) (calculateannualFee() + condolationCharges);
            System.out.println("ANNUAL FEES TO BE PAID : " + indianRupees(totalFees));
        } else {
            System.out.println("ANNUAL FEES TO BE PAID : " + indianRupees(calculateannualFee()));
        }
    }

    public static void main(String[] args) {
        Svcn obj = new Svcn("Gist", 50, 200, 150000, "Vishnu", false);
        obj.info();


    }
}

