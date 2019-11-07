import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Your name is: " + in.nextLine());
    }
}
