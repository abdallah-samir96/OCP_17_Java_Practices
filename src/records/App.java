package records;

public class App {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("abdallah", "22",100);
        System.out.println(student.g());
        System.out.println(student.name());
        System.out.println(student);
    }
}
