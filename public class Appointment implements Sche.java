public class Appointment implements Schedulable {

    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    @Override
    public void schedule() {
        System.out.println("Appointment scheduled on " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Appointment cancelled.");
    }
}