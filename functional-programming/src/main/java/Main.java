import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static final Employee employee = new Employee(1, "Adam Ingram", 100);
    private static final Employee employee1 = new Employee(1, "Adam Ingram", 100);


    public static void main(String[] args) {
        System.out.println("Lindsay Branch");

        System.out.println("I am on the adam branch...");
        System.out.println("Pushing to Stage");

        System.out.println("Stage practicing again");

        System.out.println("Employee: " + employee);
        System.out.println("Employee1: " + employee1);
        System.out.println("Using the override .equals method: " + employee.equals(employee1));

        //Stream.of
        System.out.println(Stream.of(arrayOfEmployees));

        //Using a field
        System.out.println(empList.stream());
        System.out.println(Stream.of(arrayOfEmployees[0], arrayOfEmployees[1], arrayOfEmployees[2]));

        //Builder
        System.out.println("Builder");
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arrayOfEmployees[0]);
        empStreamBuilder.accept(arrayOfEmployees[1]);
        empStreamBuilder.accept(arrayOfEmployees[2]);

        Stream<Employee> empStream = empStreamBuilder.build();

        System.out.println(Arrays.toString(empStream.toArray()));

    }

    private static final Employee[] arrayOfEmployees = {
            new Employee(1, "Jeff Bezos", 100000),
            new Employee(2, "Bill Gates", 200000),
            new Employee(3, "Mark Zuckerberg", 300000)
    };

    private static final List<Employee> empList = Arrays.asList(arrayOfEmployees);


}
