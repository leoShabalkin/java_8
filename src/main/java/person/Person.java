package person;

/**
 * Created by Leonid_Shabalkin on 27/9/2016.
 */
public class Person {
    public final String name;
    public final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("name:%s;age:%d", name, age);
    }
}
