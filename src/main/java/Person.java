import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class Person {

    String firstName;
    String lastName;
    int age;

    Person(){

    }

    Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public static List<Person> adults(List<Person> people) {

        if(people.contains(null)){
            return  Collections.emptyList();
        }

        if(!people.isEmpty()) {

            return people.stream()
                    .filter(person -> person.age >= 18)
                    .collect(Collectors.toList());
        }

        return Collections.emptyList();
    }

}
