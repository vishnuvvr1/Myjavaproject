package Inheritance_progs;

class
Bank {
    String name;
    long accountNo;
    String address;
    double amount;

    Bank() {
        accountNo = 0;
        name = " ";
        address = " ";
        amount = 0.0;
    }

    Bank(String name, long accountNo, String address, double amount) {
        this.name = name;
        this.accountNo = accountNo;
        this.address = address;
        this.amount = amount;

    }

    public void checkBalance() {
        System.out.println("Hi " + name + ". Your bank Account no is " + accountNo
                + " and your balance amount is " + amount);
    }

    public void accountDetails() {
        System.out.println("Hi " + name);
        System.out.println("Your bank Account no is = " + accountNo);
        System.out.println("Your address is = " + address);
    }
}

class SBI extends Bank {
    SBI() {
    }

    SBI(String name, long accountNo, String address, double amount) {
        super(name, accountNo, address, amount);
    }

    public static void main(String[] args) {
        SBI bank = new SBI("VISHNU VARDHAN REDDY", 89192090, "Nellore", 50000.00);
        bank.accountDetails();
        bank.checkBalance();
        SBI sbiObj = new SBI();
        SBI sbiObj1 = new SBI();
    }

}

