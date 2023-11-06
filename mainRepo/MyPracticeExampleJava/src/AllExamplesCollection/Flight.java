package AllExamplesCollection;

public class Flight {
    private int flightNumber;
    private String passengerName;
    private String origin;
    private String destination;
    private String date;
    private int numberPassenger;
    private double price;
    private int confimationNumnber;

    public Flight(int flightNumber, String passengerName, String origin, String destination,
                  String date, int numberPassenger, double price, int confimationNumnber) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numberPassenger = numberPassenger;
        this.price = price;
        this.confimationNumnber = confimationNumnber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getConfimationNumnber() {
        return confimationNumnber;
    }

    public void setConfimationNumnber(int confimationNumnber) {
        this.confimationNumnber = confimationNumnber;
    }

    public Flight() {
    }
}
