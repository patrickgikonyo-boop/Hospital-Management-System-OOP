public abstract class Person {

    private String name;
    private int id;
    private String phone;

    public Person(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public abstract void displayRole(); // Abstract Method
}