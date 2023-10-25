package AllInterfaceExamples;

public interface Rest {
    void welcome();

    void takeOrder(String order);

    void serveFood();

    void calculateBill();
}

class MyRestaurant implements Rest {
    private double totalBill = 0.0;
    private String customerOrder;

    @Override
    public void welcome() {
        System.out.println("Welcome to My Restaurant!");
    }

    @Override
    public void takeOrder(String order) {
        this.customerOrder = order;
        System.out.println("Taking order: " + order);
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food: " + customerOrder);
    }

    @Override
    public void calculateBill() {
        double price = 1500.0;
        totalBill += price;
        System.out.println("Calculating the total bill...");
        System.out.println("Total bill amount: " + totalBill);
        double discount = totalBill * 0.5;
        totalBill -= discount;
        System.out.println("total bill 50% : " + totalBill);
    }

    public static void main(String[] args) {
        Rest myRestaurant = new MyRestaurant();

        myRestaurant.welcome();
        myRestaurant.takeOrder("Burger and Fries");
        myRestaurant.serveFood();
        myRestaurant.calculateBill();
    }
}

