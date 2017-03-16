package pl.mateuszwarzyc.behavioral.strategy.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Coffee13.
 */
public class StrategyExample {

    private static void printContents(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }

    public static void main(String[] args) {

        Person bryan = new Person("Bryan", "555-123-113", 39);
        Person mark = new Person("Mark", "555-333-521", 41);
        Person chris = new Person("Chris", "555-231-565", 38);

        List<Person> people = Arrays.asList(bryan, mark, chris);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, (o1, o2) -> {
            if(o1.getAge() > o2.getAge()){
                return 1;
            }
            if(o1.getAge() < o2.getAge()) {
                return -1;
            }
            return 0;
        });

        System.out.println("\nSorted by age");
        printContents(people);

        Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println("\nSorted by name");
        printContents(people);

    }

}
