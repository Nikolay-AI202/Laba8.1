package ai202.polyanskiy;

public class Student {

    private String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public int calculateRating() {
        return 60;
    }

    @Override
    public String toString() {
        return fullName;
    }

    public boolean receivesScholarship(Student student) {
        return student.calculateRating() > 90;
    }
}
