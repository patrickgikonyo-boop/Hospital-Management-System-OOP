public class Nurse extends MedicalStaff {

    public Nurse(String name, int id, String phone, String department) {
        super(name, id, phone, department);
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse assisting in " + getDepartment());
    }

    @Override
    public void displayRole() {
        System.out.println("Nurse: " + getName());
    }
}