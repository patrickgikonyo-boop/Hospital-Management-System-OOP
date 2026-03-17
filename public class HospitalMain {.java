import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {
Hospital hospital = new Hospital("Nairobi General Hospital");
hospital.displayHospital();
        Scanner scanner = new Scanner(System.in);

        try {
            // Patient input
            System.out.print("Enter Patient Name: ");
            String pname = scanner.nextLine();

            System.out.print("Enter Patient ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Enter Illness: ");
            String illness = scanner.nextLine();

            Patient patient = new Patient(pname, pid, phone, illness);

            // Doctor input
            System.out.print("\nEnter Doctor Name: ");
            String dname = scanner.nextLine();

            System.out.print("Enter Doctor ID: ");
            int did = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();

            Doctor doctor = new Doctor(dname, did, phone, dept, salary);

            // Display
            System.out.println("\n--- DETAILS ---");
            patient.displayRole();
            doctor.displayRole();

            doctor.performDuties();

            // Bill
            System.out.print("\nEnter Bill Amount: ");
            double amount = scanner.nextDouble();

            if (amount < 0) {
                throw new IllegalArgumentException("Amount cannot be negative!");
            }

            Bill bill = new Bill(patient, amount);
            bill.printBill();

            // Appointment
            scanner.nextLine();
            System.out.print("\nEnter Appointment Date: ");
            String date = scanner.nextLine();

            Appointment appt = new Appointment(patient, doctor, date);
            appt.schedule();

        } catch (java.util.InputMismatchException e) {
            System.out.println("❌ Invalid input! Enter correct data type.");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unexpected error occurred.");
        } finally {
            scanner.close();
            System.out.println("\nProgram ended safely.");
        }
    }
}
