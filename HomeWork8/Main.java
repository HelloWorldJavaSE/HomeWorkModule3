import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1 часть задания
        Student student = new Student("Baobab");
        Student student1 = new Student("Огурчик", Optional.of(new Address("Огород", "Оргуцовский")));
        printStudentInfo(student);
        printStudentInfo(student1);
        System.out.println("");

        //2 часть задания
        System.out.println("2 Часть");
        List<String> strings = new ArrayList<>(List.of("Привет","Имя","Денис"));
        strings.add(Collections.singletonList(strings.stream().reduce((x, y) -> x + y).get()).toString());
        System.out.println(strings);
    }
    public static void printStudentInfo(Student student){
        System.out.println("Name: " + student.getName() + ".");
        student.getAddress().ifPresentOrElse(s -> System.out.println("Cyti: "+s.getCyti() + ", Region: " + s.getRegion()+ ".")
                ,()-> System.out.println("Address = null :("));
        System.out.println("---------");
    }
}