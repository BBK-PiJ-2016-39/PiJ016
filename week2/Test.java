
import java.util.Scanner;

public class Test { 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        System.out.println("You entered " + num + ".");
        int squared = square(num);
        System.out.println(squared);
        Person person1 = new Person();
        person1.talk();
    }

    private static int square(int number) {
        return number * number;
    }
    static class Person {
        void talk() {
            System.out.println("Hello!");
        }
    }
}