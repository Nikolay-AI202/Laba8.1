package ai202.polyanskiy;

public class Main {

    public static void main(String[] args) {
        GenericThreeTuple tuple = getStudentWithRating("Сидоров Петр Петрович");
        System.out.println("Студент: " + tuple.first + ", рейтинг: " + tuple.second + ", стипендия:" + tuple.three);
    }

    public static GenericThreeTuple getStudentWithRating(String fullName) {
        Student student = new Student(fullName);
        int rating = student.calculateRating();
        System.out.println("Print");
        boolean scholarship = student.receivesScholarship(student);
        System.out.println("Hello");
        System.out.println();
        return new GenericThreeTuple(student, rating, scholarship);
    }
}


