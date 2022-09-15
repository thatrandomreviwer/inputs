import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);

        System.out.println("what is the value of pi");
        double pi_value = keyboard.nextDouble();

        //clearing the buffer
        keyboard.nextLine();

        System.out.println("what is your name");
        String name = keyboard.nextLine();

        System.out.println("what is your age");
        int age = keyboard.nextInt();
        keyboard.nextByte();

        System.out.println("Good morning " + name);
        System.out.println("you are " + age + " years old");
        System.out.println(pi_value);

    }
}