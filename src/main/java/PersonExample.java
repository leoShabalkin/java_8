import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Leonid_Shabalkin on 27/9/2016.
 */
public class PersonExample {
    public static void main(String[] args) {

        List persons = Lists.newArrayList(
                new Person("anton", 20),
                new Person("Sarah", 10),
                new Person("julia", 30),
                new Person("jack", 12)
        );
        System.out.println("Predicat example:\n");
        PersonService.predicate(persons);

        System.out.println("Sort By name example:\n");
        PersonService.sortByName(persons);

        System.out.println("Sort By age example:\n");
        PersonService.sortByAge(persons);

        System.out.println("Consumer example:\n");
        PersonService.consumer(persons);

        System.out.println("Function example:\n");
        PersonService.function(persons);

        System.out.println("BiFunction example:\n");
        PersonService.biFunction(persons);

        System.out.println("UnaiOperation example:\n");
        PersonService.unaiOperation(persons);

        System.out.println("Runnable example:\n");
        PersonService.runnable(persons);

        System.out.println("Supplier example:\n");
        PersonService.supplier(persons);

        persons.forEach(System.out::println);

    }



}
