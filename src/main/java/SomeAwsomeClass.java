import java.util.List;

public class SomeAwsomeClass {

    public static List<String> getSomeStrings(){
        var stringOne = "First String using 'var' keyword.";
        var stringTwo = "Another String";
        return List.of(stringOne,stringTwo);
    }
}
