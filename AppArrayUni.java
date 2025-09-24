import java.util.Arrays;

public class AppArrayUni {
    public static void main(String[] args) {
        // Student[] students = new Student[new Student("Davi") new Student("Diego")];
        // Student[] students = {new Student("John"), new Student("Doe")};
        Student[] students = {new Student("Davi"), new Student("Diego")};
        
        // Ideal para arrays unidimensionais
        System.out.println(Arrays.toString(students));
    }
}
