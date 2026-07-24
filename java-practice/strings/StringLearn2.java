package strings;

import java.lang.String;

public class StringLearn2 {
    static void main() {
        String name = "Java Programming Language";
        System.out.println(name);
        System.out.println("9. " + name.contains("Programming"));
        System.out.println("10. " + name.startsWith("Java"));
        System.out.println("11. " + name.endsWith("Language"));
        System.out.println("12. " + name.equals("Java Programming Language"));
        System.out.println("13. " + name.equalsIgnoreCase("java programming language"));
        System.out.println("14. " + name.indexOf("Programming"));
        String text = "Java is powerful. Java is popular.";
        System.out.println("15. " + text.lastIndexOf("Java"));
        System.out.println("16. " + name.replace("Java", "Python"));
        String digits = "A1B2C3D4";
        System.out.println("17. " + digits.replaceAll("[0-9]", "*"));
        String s1 = "";
        System.out.println("18. " + s1.isEmpty());
        System.out.println("19. " + "Hi ".repeat(5));
        System.out.println("20. " + "Apple".compareTo("Banana"));
    }
}
