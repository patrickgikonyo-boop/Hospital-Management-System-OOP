public abstract class MedicalStaff extends Person {

    private String department;

    public MedicalStaff(String name, int id, String phone, String department) {
        super(name, id, phone); // super used
        this.department = department; // this used
    }

    public String getDepartment() {
        return department;
    }

    public abstract void performDuties();
}