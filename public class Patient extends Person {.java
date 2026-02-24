public class Patient extends Person {

    private String illness;

    public Patient(String name, int id, String phone, String illness) {
        super(name, id, phone);
        this.illness = illness;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public void displayRole() {
        System.out.println("Patient: " + getName() + " | Illness: " + illness);
    }
}