import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

final class Fox {


    static List<String> slowFoxes(final List<String> foxes) {

        if (foxes == null) {
            return Collections.emptyList();
        }

        return foxes.stream()
                .filter(fox -> !"Swift Fox".equals(fox))
                .collect(Collectors.toList());

    }


}