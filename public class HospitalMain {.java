import java.util.*;
import java.io.*;

public class HospitalMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // COLLECTION
        ArrayList<Patient> patients = new ArrayList<>();

        try {

            // LOAD EXISTING DATA FROM FILE
            loadPatientsFromFile(patients);

            System.out.print("Enter Patient Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Patient ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Enter Illness: ");
            String illness = scanner.nextLine();

            Patient p = new Patient(name, id, phone, illness);

            // ADD TO COLLECTION
            patients.add(p);

            // DISPLAY ALL PATIENTS
            System.out.println("\n--- ALL PATIENTS ---");
            for (Patient pat : patients) {
                pat.displayRole();
            }

            // SAVE TO FILE
            savePatientsToFile(patients);

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input type.");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nProgram ended safely.");
        }
    }

    //  FILE WRITE 
    public static void savePatientsToFile(ArrayList<Patient> patients) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt"));

            for (Patient p : patients) {
                writer.write(p.getName() + "," + p.getId() + "," + p.getPhone() + "," + p.getIllness());
                writer.newLine();
            }

            writer.close();
            System.out.println("✅ Patients saved to file.");

        } catch (IOException e) {
            System.out.println("❌ Error saving file.");
        }
    }

    //  FILE READ 
    public static void loadPatientsFromFile(ArrayList<Patient> patients) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("patients.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int id = Integer.parseInt(data[1]);
                String phone = data[2];
                String illness = data[3];

                Patient p = new Patient(name, id, phone, illness);
                patients.add(p);
            }

            reader.close();
            System.out.println("✅ Patients loaded from file.");

        } catch (FileNotFoundException e) {
            System.out.println("No previous file found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("❌ Error reading file.");
        }
    }
}
        
    

