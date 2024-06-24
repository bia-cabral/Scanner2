import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Prompt for age
        System.out.println("Enter your age:");
        String age = scanner.nextLine();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
