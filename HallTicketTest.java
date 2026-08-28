class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class HallTicketTest {

    public static void main(String[] args) {

        // First object
        HallTicket priya = new HallTicket("Priya", 0);

        // Second variable points to SAME object
        HallTicket copy = priya;

        // Change using copy
        copy.seatNumber = 45;

        // Print using first variable
        System.out.println(
            "Priya's seatNumber (via first variable): "
            + priya.seatNumber
        );

        // Check if both refer to same object
        System.out.println("copy == priya: " + (copy == priya));

        // Third separate object
        HallTicket separate = new HallTicket("Priya", 45);

        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}