package EnumerationsExamples;

enum Restaurants {
    dominos, kfc, pizzahut, paninos, burgerking
}

public class EnumerationsExample2 {
    public static void main(String args[]) {
        Restaurants r; // r is the object
        r = Restaurants.dominos;
        switch (r) {  // use switch (or) nested if condition
           // type name i.e only r, not Restaurants.r
            case dominos:
                System.out.println("I AM " + r.dominos);
                break;
            case kfc:
                System.out.println("I AM " + r.kfc);
                break;
            case pizzahut:
                System.out.println("I AM " + r.pizzahut);
                break;
            case paninos:
                System.out.println("I AM " + r.paninos);
                break;
            case burgerking:
                System.out.println("I AM " + r.burgerking);
                break;
        }
    }
}

