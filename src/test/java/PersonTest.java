import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

final class PersonTest {

    @Test
    void getAdultsNullistReturnsEmptyList(){
        //Setup
        final List<Person> adults = Collections.singletonList(null);
        //Exercise
        final List<Person> actual = Person.adults(adults);

        //Assert
        assertThat(actual, is(Collections.emptyList()));

    }

    @Test
    @Disabled
    void getAdultsEmptyListReturnsEmptyList(){
        //Setup
        final List<Person> adults = Collections.emptyList();
        //Exercise
        final List<Person> actual = Person.adults(adults);

        //Assert
        assertThat(actual, is(Collections.emptyList()));

    }

    @Test
    void getOneAdultReturnOneAdult(){
        //Setup
        final List<Person> adults = Collections.singletonList(new Person("John", "Doe", 18));
        //Exercise
        final List<Person> actual = Person.adults(adults);

        //Assert
        assertThat(actual, is(adults));

    }

    @Test
    void getMultiplePeopleReturnOneAdult(){
        //Setup
        Person one = new Person("Jane", "Doe", 17);
        Person two = new Person("John", "Doe", 18);

        final List<Person> adults = Arrays.asList(one,two);
        //Exercise
        final List<Person> actual = Person.adults(adults);

        //Assert
        assertThat(actual, is(Arrays.asList(two)));

    }

}
