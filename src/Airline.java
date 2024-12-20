public class Airline {
    private String flight;
    private String passenger;
    private String booking;

    // Конструктор
    public Airline(String flight, String passenger, String booking) {
        this.flight = flight;
        this.passenger = passenger;
        this.booking = booking;
    }

    // Геттеры и сеттеры для flight
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    // Геттеры и сеттеры для passenger
    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    // Геттеры и сеттеры для booking
    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }
}