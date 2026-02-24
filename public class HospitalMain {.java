public class HospitalMain {

    public static void main(String[] args) {

        // Creating objects
        Patient p1 = new Patient("John Doe", 101, "0712345678", "Malaria");
        Doctor d1 = new Doctor("Dr. Smith", 201, "0723456789", "General Medicine", 150000);
        Nurse n1 = new Nurse("Jane", 301, "0734567890", "Emergency");

        // Demonstrating inheritance
        p1.displayRole();
        d1.displayRole();
        n1.displayRole();

        // Demonstrating polymorphism
        d1.performDuties();
        n1.performDuties();

        // Bill
        Bill bill = new Bill(p1, 5000);
        bill.printBill();

        // Appointment
        Appointment appointment = new Appointment(p1, d1, "20 May 2026");
        appointment.schedule();
    }
}