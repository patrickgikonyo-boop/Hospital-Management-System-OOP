public class Hospital {

    private String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void displayHospital() {
        System.out.println("Welcome to " + hospitalName);
    }
}
