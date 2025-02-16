import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name below:");
        String name = reader.nextLine();
        System.out.println("Hi there, " + name);
    }
}