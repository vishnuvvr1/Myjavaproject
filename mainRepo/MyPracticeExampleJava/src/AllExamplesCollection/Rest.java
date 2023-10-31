package AllExamplesCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rest {
    public ArrayList<String> menuItems;
    public ArrayList<Double> prices;
    public ArrayList<Integer> ratings;
    public ArrayList<Integer> itemCount;

    public Rest() {
        this.menuItems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.itemCount = new ArrayList<>();
    }
}

class Admin extends Rest {
    public void addItems(String menuItems, Double price, Integer ratings, Integer itemCount) {
        this.menuItems.add(menuItems);
        this.prices.add(price);
        this.ratings.add(ratings);
        this.itemCount.add(itemCount);
    }

    public void removeItem(String item) {
        int index = this.menuItems.indexOf(item);
        if (index >= 0) {

            this.menuItems.remove(index);
            this.prices.remove(index);
            this.ratings.remove(index);
            this.itemCount.remove(index);
        } else {
            System.out.println("item not found in the menu ");
        }
    }


    public void itemsLIst(List<String> menuItems, List<Double> prices,
                          List<Integer> ratings, List<Integer> itemCount) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " : " + prices.get(i) + " Rs : "
                    + ratings.get(i) + " star : " + itemCount.get(i) + " items");
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items you are going to add : ");
        int no = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your item " + (i + 1) + " details");
            System.out.println("Enter the Item name : ");
            String menuItem = sc.nextLine();
            System.out.println("Enter the price : ");
            double price = sc.nextDouble();
            System.out.println("Enter the rating : ");
            int ratings = sc.nextInt();
            System.out.println("Entre the item count : ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            admin.addItems(menuItem, price, ratings, itemCount);
        }
        admin.itemsLIst(admin.menuItems, admin.prices, admin.ratings, admin.itemCount);
        System.out.println("How many items you to order = ");
        int orderCount = sc.nextInt();
        sc.nextLine();
        List<String> menu = new ArrayList<>();
        List<Double> givenCost = new ArrayList<>();
        List<Integer> givenRating = new ArrayList<>();
        List<Integer> givenItemCount = new ArrayList<>();
        if (orderCount > admin.menuItems.size()) {
            System.out.println("please enter valid order count ");
            orderCount = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < orderCount; i++) {
            System.out.println("please choose item = " + (i + 1));
            String givenItem = sc.nextLine();
            menu.add(givenItem);
            int index = admin.menuItems.indexOf(givenItem);
            givenCost.add(admin.prices.get(index));
            givenRating.add(admin.ratings.get(index));
            givenItemCount.add(admin.itemCount.get(index)); break;
        }
        System.out.println("your order details are ");
        admin.itemsLIst(menu, givenCost, givenRating, givenItemCount);
        int totalOrderAmount = generateOrderAmount(menu, givenCost, givenItemCount);
        System.out.println("your order Amount is " + totalOrderAmount);
    }

    private static int generateOrderAmount(List<String> menu, List<Double> givenCost, List<Integer> givenItemCount) {
        int totalAmount = 0;
        for (int i = 0; i < menu.size(); i++) {
            totalAmount = (int) (givenItemCount.get(i) * givenCost.get(i));

        }
        return totalAmount;
    }

}
