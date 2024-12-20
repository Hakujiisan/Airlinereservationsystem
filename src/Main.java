public class Main {
    public static void main(String[] args) {
        // Создаем объекты Airline
        Airline booking1 = new Airline(
                "Flight A123",         // Рейс
                "John Doe",            // Пассажир
                "Confirmed"            // Статус бронирования
        );

        Airline booking2 = new Airline(
                "Flight B456",
                "Jane Smith",
                "Pending"
        );

        // Выводим информацию о бронированиях
        System.out.println(booking1.getFlight() + " | "
                + booking1.getPassenger() + " | "
                + booking1.getBooking());

        System.out.println(booking2.getFlight() + " | "
                + booking2.getPassenger() + " | "
                + booking2.getBooking());
    }
}