package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Михаил Юрьевич", "Математика");
        Student student = new Student("Петров Николай Иванович");
        teacher.evaluate(student);

    }
}
