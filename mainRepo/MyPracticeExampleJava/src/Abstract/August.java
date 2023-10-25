package Abstract;

public class August extends Abstract.Month {

    boolean savings = true;

    public August() {

    }

    public August(String name, int salary, int costs, String companyName) {
        super(name, salary, costs, companyName);
    }

    @Override

    public void getMonthlyPayslip(Abstract.August obj) {
        System.out.println("NAME OF THE MONTH: " + obj.getName());
        System.out.println("SALARY OF THE PERSON : " + obj.getSalary());
        System.out.println("AMOUNT OF MONEY SPENT BY PERSON : " + obj.getCosts());
        System.out.println("COMPANY NAME : " + obj.getCompanyName());
    }

    @Override
    public int monthlySavings(int salary) {
        return 0;
    }

    @Override
    public int calculateSavings() {
        return 0;
    }

    public void monthlySavings(int salary,int costs) {
        int totalSaving=calculateSavings(salary,costs);
        System.out.println("your monthly saving are : " + totalSaving);

        if (!savings) {
            System.out.println("YOUR SAVINGS ARE BAD. ");
        } else {
            System.out.println("YOURE SAVINGS ARE GOOD. ");
        }
    }


    public int calculateSavings(int salary, int costs) {
        int saveMoney = (salary - costs);
        if (saveMoney < costs) {
            savings = false;
        }
        return saveMoney;
    }

    public static void main(String[] args) {
        Abstract.August obj = new Abstract.August("august", 50000, 1000, "TCS");
        obj.getMonthlyPayslip(obj);
        obj.monthlySavings(0);


    }
}

