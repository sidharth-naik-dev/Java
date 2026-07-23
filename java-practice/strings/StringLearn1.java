package strings;
import java.lang.String;
public class StringLearn {
    static void main() {
        String name = "What is your name?";
        System.out.println(name);
        System.out.println("1. " + name.charAt(2));  // 2 = Index
        name = name.concat(" Hello, My name is Hero."); // Returns the concatenated string
        System.out.println("2. " +name);
        System.out.println("3. " +name.length()); // Returns the number of characters present inside name
        name = name.toLowerCase(); // Returns the lowercased string
        System.out.println("4. " +name);
        name = name.toUpperCase(); // Returns the uppercased string
        System.out.println("5. " +name);
        System.out.println("             Hello Hero    ");
        System.out.println("6. " +"            Hello Hero    ".trim()); // Returns filtered string by removing the spaces before and after the string
        System.out.println("7. " +name.substring(15)); // Returns the substring beginning from the provided index to the rest of the string
        System.out.println("8. " +name.substring(15,25)); // Returns the substring beginning from the provided index to end of characters - substring(int startIndex, int endIndex)

    }
}
