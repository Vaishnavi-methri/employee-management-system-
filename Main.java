import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Vaishnavi", 50000));
        list.add(new Employee(2, "Rahul", 60000));

        System.out.println("Employee Details:");
        for (Employee e : list) {
            e.display();
        }
    }
}