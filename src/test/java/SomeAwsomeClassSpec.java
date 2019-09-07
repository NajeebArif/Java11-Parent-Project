import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("This project must support Java 11 and junit 5 with assertJ")
class SomeAwsomeClassSpec {

    @Test
    @DisplayName("Target method should return a list of two strings in exact order.")
    void testSomeStrings(){
        List<String> someStrings = SomeAwsomeClass.getSomeStrings();
        assertThat(someStrings)
                .isNotNull()
                .isNotEmpty()
                .hasSize(2)
                .containsExactlyInAnyOrder("First String using 'var' keyword.","Another String");
    }
}
