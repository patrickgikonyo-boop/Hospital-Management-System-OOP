public class Bill implements Payable {

    private Patient patient;
    private double amount;

    public Bill(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    public void printBill() {
        System.out.println("Bill for " + patient.getName() + " is KES " + amount);
    }
}