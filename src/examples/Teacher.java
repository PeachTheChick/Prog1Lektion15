package examples;

public class Teacher extends Person {
    private String title;

    public Teacher(String firstName, String lastName, String title) {
        super(firstName, lastName);
        this.title = title;
    }

    public String getFullName() {
        return title + " " + super.getFullName();
    }
}
