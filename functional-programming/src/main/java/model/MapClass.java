package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapClass {
    public static void main(String[] args) {
        System.out.println(Stream.of(arrayOfEmployees).map((e) -> e.getId()).toList());
        System.out.println(Stream.of(arrayOfEmployees).map(Employee::getName).toList());


        List<String> myList = new ArrayList<>();
        myList.add("Adam");
        myList.add("Ingram");
        myList.add("Lindsay");
        myList.add("Ingram");
        System.out.println(myList);




    }

    private static final Employee[] arrayOfEmployees = {
            new Employee(1, "Jeff Bezos", 100000),
            new Employee(2, "Bill Gates", 200000),
            new Employee(3, "Mark Zuckerberg", 300000)
    };
}
