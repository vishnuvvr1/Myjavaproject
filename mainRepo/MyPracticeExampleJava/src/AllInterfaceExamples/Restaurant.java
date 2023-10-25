package AllInterfaceExamples;

import java.sql.SQLOutput;

public interface Restaurant {
    void welcome();

    void billDetails(long billAmount, int noOfItems, int billId, String date);

    double calculateBill(long billAmount, double discount);
}

class Hotel1 implements Restaurant {


    @Override
    public void welcome() {
        System.out.println("Welcome to My Restaurant sir!");
    }

    @Override
    public void billDetails(long billAmount, int noOfItems, int billId, String date) {
        System.out.println("your billAmount is : " + billAmount);
        System.out.println("noOfItems : " + noOfItems);
        System.out.println("billid : " + billId);
        System.out.println("todayDate : " + date);
    }

    @Override
    public double calculateBill(long billAmount, double discount) {
        System.out.println("Calculating the total bill...");
        System.out.println("Total bill amount: " + billAmount);
        discount = billAmount * 0.5;
        billAmount -= discount;
        System.out.println("total bill 50% : " + billAmount);
        return billAmount;
    }


    public static void main(String[] args) {
        Hotel1 obj = new Hotel1();
        obj.welcome();
        obj.billDetails(15000, 5, 1021, "17-10-2023");
        obj.calculateBill(15000, 0.5);

    }
}