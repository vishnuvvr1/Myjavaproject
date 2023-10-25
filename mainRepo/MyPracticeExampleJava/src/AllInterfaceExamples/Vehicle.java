package AllInterfaceExamples;

public interface Vehicle {

    void mileage(int litres, int kilometres);

    void vehicleDetails(String name, String model, String mfgYear, String maxSpeed);
}

class Bike implements Vehicle {


    @Override
    public void mileage(int litres, int kilometres) {
        double mileage = (double) kilometres / litres;
        System.out.println("mileage : " + mileage);

    }

    @Override
    public void vehicleDetails(String name, String model, String mfgYear, String maxSpeed) {
        System.out.println("bikeName : " + name);
        System.out.println("bikemodel : " + model);
        System.out.println("bikemfgyear : " + mfgYear);
        System.out.println("maxspeed : " + maxSpeed);

    }


    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.vehicleDetails("Rx100", "2-5-2003", "1998", "90");
        obj.mileage(10, 120);
    }
}
