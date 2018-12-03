import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

final class Library {

        public static void main (final String ... args) {

            final List<String> words = Arrays.asList(
                    "the",
                    "shortest",
                    "shorter",
                    "Fred",
                    "longer",
                    "longest");

            final List<String> longWords = words
                    .stream()
                    .filter(Library::removeShortWords)
                    .collect(Collectors.toList());

            final Predicate<String> shorterThanThree = wordShorterThan(3);
            final Predicate<String> shorterThanSix = wordShorterThan(6);

            final List<String> shortWords = words
                    .stream()
                    .filter(shorterThanSix)
                    .collect(Collectors.toList());

            System.out.println(longWords);
            System.out.println(shortWords);

        }

    public static boolean removeShortWords(String testString) {

            return Optional
                    .ofNullable(testString)
                    .orElse("")
                    .length()>4;
    }

    public static Predicate<String> wordShorterThan(final int minLength){
            return testString -> Optional
                    .ofNullable(testString)
                    .orElse("")
                    .length() > minLength;
    }
}