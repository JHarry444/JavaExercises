package Level2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
//        System.out.println(new Blackjack().blackjack(20, 22));
//        System.out.println(new UniqueSum().uniqueSum(3,3, 3));
//        System.out.println(new TooHot().isTooHot(99, true));
/*        Person dale = new Person("Dale Carr", 28, "Consultant Trainer");
        Person assad = new Person("Assad Hussein", 22, "Trainee Consultant");
        Person nelvin = new Person("Nelvin Jones", 22, "Trainee Consultant");
        Person jordan = new Person("Jordan Harrison", 24, "Trainee Consultant");
        List<Person> people = new ArrayList<Person>();
        people.add(dale);
        people.add(assad);
        people.add(nelvin);
        people.add(jordan);
        for (Person person : people) {
            System.out.println(person.toString());
        }*/
/*    List<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Car("1", 1));
    vehicles.add(new Car("2", 2));
    vehicles.add(new Car("3", 3));
    vehicles.add(new Lorry("4", 1));
    vehicles.add(new Lorry("5", 2));
    vehicles.add(new Lorry("6", 3));
    vehicles.add(new Motorbike("7", 1));
    vehicles.add(new Motorbike("8", 2));
    vehicles.add(new Motorbike("9", 3));
    Garage garage = new Garage(vehicles);
    System.out.println(garage);
    garage.removeVehicleByType(Car.class);*/
//        PaintWizard.findLeastWasteful(1500);
//        PaintWizard.findCheapest(2000);
        Person ifti = new Person("Ifti Khan", 28, "Trainee Consultant");
        Person dale = new Person("Dale Carr", 28, "Consultant Trainer");
        Person assad = new Person("Assad Hussein", 22, "Trainee Consultant");
        Person nelvin = new Person("Nelvin Jones", 22, "Trainee Consultant");
        Person jordan = new Person("Jordan Harrison", 24, "Trainee Consultant");
        List<Person> people = new ArrayList<Person>();
        people.add(ifti);
        people.add(dale);
        people.add(assad);
        people.add(nelvin);
        people.add(jordan);
        for (Person person : people) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\Admin" + person.name)));
                writer.write(person.toString());
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            } finally {
                writer
            }
        }
    }

}
