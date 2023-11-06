package AllExamplesCollection;
import java.util.*;
import java.util.Map;

public class AdminCityUser {
    static Map<String, List<City>> countryDetails = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Countries details you want : ");
        int countryCount = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < countryCount; i++) {
            System.out.println("Enter the country " + (i + 1) + "details");
            System.out.println("Enter the Country name : ");
            String countryName = sc.nextLine();
            System.out.println("Enter how many Cities do you want");
            int cityCount = sc.nextInt();
            sc.nextLine();
            List<City> cities = new ArrayList<>();
            for (int j = 0; j < cityCount; j++) {
                System.out.println("Enter the City " + (j + 1) + "details");
                System.out.println("Enter the city name : ");
                String cityName = sc.nextLine();
                System.out.println("Enter the population : ");
                long pCount = sc.nextLong();
                sc.nextLine();
                System.out.println("Enter the famous food : ");
                String famousFood = sc.nextLine();
                System.out.println("Enter Famous places in your city : ");
                String famousPlace = sc.nextLine();
                System.out.println("Enter address of Famous place : ");
                String famousPlaceAddress = sc.nextLine();
                FamousPlace famousPlaces = new FamousPlace(famousPlace, famousPlaceAddress);
                City city = new City(cityName, pCount, famousFood, famousPlaces);
                cities.add(city);
            }
            countryDetails.put(countryName, cities);
        }
        System.out.println("Here are the Country Details");
        printCountryDetails(countryDetails);
    }

    private static void printCountryDetails(Map<String, List<City>> countryDetails) {
        for (Map.Entry<String, List<City>> entry : countryDetails.entrySet()) {
            System.out.println("Country Details " + entry.getKey());
            System.out.println("***City Details***");
            for (City city : entry.getValue()) {
                System.out.println(city.toString());
            }
        }
    }
}
