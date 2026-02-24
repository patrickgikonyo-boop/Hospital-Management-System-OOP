public class Doctor extends MedicalStaff implements Payable {

    private double salary;

    public Doctor(String name, int id, String phone, String department, double salary) {
        super(name, id, phone, department);
        this.salary = salary;
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor treating patients in " + getDepartment());
    }

    @Override
    public void displayRole() {
        System.out.println("Doctor: " + getName());
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}