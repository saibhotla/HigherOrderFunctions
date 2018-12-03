import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

final class FoxTest {

    @Test
    void returnEmptyListForNullList() {
        //Setup
        final List<String> foxes = null;
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void returnNullListForSingleNull() {
        //Setup
        final List<String> foxes = Collections.singletonList(null);
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual.isEmpty(), is(false));

    }

    @Test
    void returnNullListForMultipleNull() {
        //Setup
        final List<String> foxes = Arrays.asList(null, null, null);
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        //assertThat(actual, contains((String)null, (String)null, (String)null));
        assertThat(actual, is(Arrays.asList(null, null, null)));

    }

    @Test
    void returnEmptyForListWithSwiftFox() {
        //Setup
        final List<String> foxes = Collections.singletonList("Swift Fox");
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void returnArcticFoxForListWithoutSwiftFox() {
        //Setup
        final List<String> foxes = Collections.singletonList("Arctic Fox");
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual, contains("Arctic Fox"));

    }

    @Test
    void returnRedFoxForListWithSwiftFox() {
        //Setup
        final List<String> foxes = Arrays.asList("Red Fox", "Swift Fox");
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual, contains("Red Fox"));

    }

    @Test
    void returnMultipleFoxForListWithSwiftFox() {
        //Setup
        final List<String> foxes = Arrays.asList("Arctic Fox", "Red Fox", "Swift Fox");
        //Exercise
        final List<String> actual = Fox.slowFoxes(foxes);

        //Assert
        assertThat(actual, contains("Arctic Fox", "Red Fox"));

    }


}
