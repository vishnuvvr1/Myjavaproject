package EnumerationsExamples;

enum Restaurant {
    DOMINOS, KFC, PIZZAHUT, PANINOS, BURGERKING
}

public class EnumerationsExample5 {
    public static void main(String args[]) {
        Restaurant r;
        System.out.println("All constants of enum type Restaurants are:");
        Restaurants rArray[] = Restaurants.values(); //returns an array of constants of type Restaurants
        for (Restaurants a : rArray) //using foreach loop
            System.out.println(a);  // this is values() means alla values are print
        System.out.println("\n");
        for (int i = 0; i < rArray.length; i++) {  // use for loop also
            System.out.println(rArray[i]);
        }

        r = Restaurant.valueOf("DOMINOS"); // this is called valuesof() means single value print
        System.out.println("It is " + r);
    }
}

