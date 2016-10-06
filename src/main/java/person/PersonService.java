package person;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Created by Leonid_Shabalkin on 29/9/2016.
 */
public class PersonService {
    public static void sortByName(List<Person> persons) {
        persons.sort((p1, p2) -> p1.name.compareTo(p2.name));
    }

    public static void sortByAge(List<Person> persons) {
        persons.sort((p1, p2) -> p1.age.compareTo(p2.age));
    }

    public static void supplier(final List<Person> persons) {
        persons.forEach((p) -> {
            printNames(() -> p);
        });
    }

    private static void printNames(Supplier arg) {
        System.out.println(arg.get());
    }

    public static void consumer(List<Person> persons) {
        persons.forEach(System.out::println);
    }

    public static void runnable(List<Person> persons) {
        Runnable task = () -> persons.forEach(System.out::println);
        Thread thread = new Thread(task);
        thread.start();
    }

    public static void function(List<Person> persons) {
        persons.stream().map(value -> "Name is " + value.name).forEach(System.out::println);
    }

    public static void biFunction(List<Person> persons) {
        BiFunction<String, Integer, String> biFunction = (num1, num2) -> "Name:" + num1 + "Age" + num2;
        persons.forEach(p -> System.out.println(biFunction.apply(p.name, p.age)));
    }

    public static void unaiOperation(List<Person> persons) {
        UnaryOperator<String> i = String::toUpperCase;
        persons.forEach(p -> System.out.println(i.apply(p.name)));
    }

    public static void predicate(List<Person> persons) {
        persons.stream().filter(p -> p.age > 20).forEach(System.out::println);
    }
}
