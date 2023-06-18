package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n" +"0 - Exit");
        int option = scanner.nextInt();
        System.out.println("Your choice:" + option);

        switch (option) {
            case 0:
                scanner.close();
                break;
            case 1:
                System.out.println("Welcome to the Brain Games!");
                Cli.greet(Cli.getName());
                scanner.close();
                break;
        }
    }
}
