package ai202.polyanskiy;

public class Main {

    public static void main(String[] args) {
        GenericThreeTuple tuple = getStudentWithRating("Сидоров Петр Петрович");
        System.out.println("Студент: " + tuple.first + ", рейтинг: " + tuple.second + ", стипендия:" + tuple.three);
    }

    public static GenericThreeTuple getStudentWithRating(String fullName) {
        Student student = new Student(fullName);
        int rating = student.calculateRating();
        boolean scholarship = student.receivesScholarship(student);

        return new GenericThreeTuple(student, rating, scholarship);
    }
}


