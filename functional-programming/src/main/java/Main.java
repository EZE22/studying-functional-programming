import model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
//    private static final Employee employee = new Employee(1, "Adam Ingram", 100);
//    private static final Employee employee1 = new Employee(1, "Adam Ingram", 100);


    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        return revName(scanner.next());
    }

    public static String revName(String name) {
        StringBuilder builder = new StringBuilder(name);
        return builder.reverse().toString();
    }

    public static String greeting() {
        String userInput = getUserInput();
        return "Hello World " + userInput;
    }

    public static void main(String[] args) {
        System.out.println(greeting());




















//        System.out.println("Employee: " + employee);
//        System.out.println("Employee1: " + employee1);
//        System.out.println("Using the override .equals method: " + employee.equals(employee1));

        //Stream.of
//        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
//        stream.forEach(p -> System.out.println(p));

        //Stream.of(array)
//        Stream<Integer> stream1 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
//        stream.forEach(p -> System.out.println(p));

        //List.stream()
//        List<Integer> list = new ArrayList<Integer>();
//
//        for(int i = 1; i< 10; i++){
//            list.add(i);
//        }
//
//        Stream<Integer> stream2 = list.stream();
//        stream.forEach(p -> System.out.println(p));

        //Stream.collect()
//        ArrayList<String> memberNames = new ArrayList<>();
//        memberNames.add("Hello");
//        memberNames.add("World");
//
//        List<String> memNamesInUppercase = memberNames.stream().sorted()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.print(memNamesInUppercase);

    }

    private static final Employee[] arrayOfEmployees = {
            new Employee(1, "Jacob Goodson", 100000),
            new Employee(2, "Lindsay Ingram", 200000),
            new Employee(3, "Jack Jill", 300000)
    };

    private static final List<Employee> empList = Arrays.asList(arrayOfEmployees);


}