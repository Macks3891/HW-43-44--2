import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public static void main(String[] args) {
        // a. Создайте пустой список students для хранения имен студентов
        List<String> students = new ArrayList<>();

        // b. Добавьте начальный список студентов
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        // Добавьте еще несколько студентов, используя addAll()
        List<String> additionalStudents = new ArrayList<>();
        additionalStudents.add("Frank");
        additionalStudents.add("Grace");
        additionalStudents.add("Helen");

        students.addAll(additionalStudents);

        // Выведем список студентов
        System.out.println("Список студентов после добавления:");
        for (String student : students) {
            System.out.println(student);
        }

        // c. Удаление студента по имени
        String studentToRemove = "Bob";
        if (students.remove(studentToRemove)) {
            System.out.println("\nСтудент " + studentToRemove + " удален.");
        } else {
            System.out.println("\nСтудент " + studentToRemove + " не найден.");
        }

        // Удаление студента по индексу
        int indexToRemove = 2; // Удалим студента с индексом 2 (третий по счету)
        if (indexToRemove >= 0 && indexToRemove < students.size()) {
            String removedStudent = students.remove(indexToRemove);
            System.out.println("Студент " + removedStudent + " удален по индексу " + indexToRemove + ".");
        } else {
            System.out.println("Неверный индекс для удаления.");
        }

        // Выведем список студентов после удаления
        System.out.println("\nСписок студентов после удаления:");
        for (String student : students) {
            System.out.println(student);
        }

        // d. Проверка студентов в списке
        String studentToCheck = "Alice";
        if (students.contains(studentToCheck)) {
            System.out.println("\nСтудент " + studentToCheck + " содержится в списке.");
        } else {
            System.out.println("\nСтудент " + studentToCheck + " не содержится в списке.");
        }

        List<String> namesToCheck = new ArrayList<>();
        namesToCheck.add("Alice");
        namesToCheck.add("Frank");
        namesToCheck.add("Helen");

        if (students.containsAll(namesToCheck)) {
            System.out.println("Все имена из списка namesToCheck содержатся в списке students.");
        } else {
            System.out.println("Не все имена из списка namesToCheck содержатся в списке students.");
        }

        // e. Получение размера и проверка на пустоту
        int size = students.size();
        System.out.println("\nКоличество студентов в списке: " + size);

        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            System.out.println("Список студентов не пуст.");
        }

        // f. Очистка списка
        students.clear();
        System.out.println("\nСписок студентов очищен.");

        if (students.isEmpty()) {
            System.out.println("Список студентов теперь пуст.");
        } else {
            System.out.println("Список студентов не пуст.");
        }
    }
}