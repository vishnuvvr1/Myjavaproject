package Methodoverloading;

class Vehicle {
    String vehicleType;
    String modelNumber;
    String fullEfficiency;

    Vehicle() {

    }

    Vehicle(String vehicleType, String modelNumber, String fullEfficiency) {
        this.vehicleType = vehicleType;
        this.modelNumber = modelNumber;
        this.fullEfficiency = fullEfficiency;
    }

    public String getVehicleType() {
        return getVehicleType();
    }

    public String getModelNumber() {
        return getModelNumber();
    }

    public class Bike extends Vehicle {
        Bike(String vehicleType, String modelNumber, String fullEfficiency) {
            super(vehicleType, modelNumber, fullEfficiency);
        }

        public int fullEfficiency() {
            int numberofPearsons = 1;
            int kilometers = 0;
            int fuelConsumered = 0;
            int totalnumnbersSeats = 1;
            int fullEfficiency = (kilometers / fuelConsumered + (kilometers + (numberofPearsons / totalnumnbersSeats)));
            return fullEfficiency;
        }

    }


}
