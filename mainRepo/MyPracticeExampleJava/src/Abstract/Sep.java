 package Abstract;

import java.util.Scanner;

public class Sep extends August {

    public Sep(String name, int salary, int costs, String companyName) {
        super(name, salary, costs, companyName);
    }

    public Sep() {

    }

    public static void main(String[] args) {
        Sep obj = new Sep();
        Scanner vvr = new Scanner(System.in);
        System.out.println("Enter your company name : ");
        String companyName = vvr.nextLine();
        System.out.println("Enter the month name : ");
        String name = vvr.nextLine();
        System.out.println("Enter your salary : ");
        int salary = vvr.nextInt();
        System.out.println("Enter your Expenses : ");
        int coast = vvr.nextInt();
        obj.setName(name);
        obj.setSalary(salary);
        obj.setCosts(coast);
        obj.setCompanyName(companyName);
        obj.getMonthlyPayslip(obj);
        obj.monthlySavings(obj.getSalary(), obj.getCosts());
    }
}
