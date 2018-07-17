package Level2;

import java.util.List;

public class Person {

    String name;

    int age;

    String jobTitle;

    public Person(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public Person findByName(List<Person> people, String name) {
        for (Person person : people) {
            if (person.name.equals(name))
                return person;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " JobTitle: " + this.jobTitle;
    }
}
