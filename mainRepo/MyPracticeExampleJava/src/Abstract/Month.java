package Abstract;

public abstract class Month {
    private String name;
    protected int salary;
    protected int costs;
    private String companyName;
    public Month(){

    }

    public Month(String name, int salary, int costs, String companyName) {
        this.name = name;
        this.salary = salary;
        this.costs = costs;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public abstract void getMonthlyPayslip(August august);

    public abstract int monthlySavings(int salary);

    public abstract int calculateSavings();
}