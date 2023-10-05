package Methodoverloading;

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int employeeId;
    String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("junior", "philipa", 4452, "Software Manager");

        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name with Job Title: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}