package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public static void greet(String name) {
        System.out.printf("Hello, %s!\n", name);
    }
}
