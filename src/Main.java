import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);

        System.out.println("what is the value of pi");
        double pival = keyboard.nextDouble();

        //cleaing the buffer
        keyboard.nextLine();


        System.out.println("what is your name");
        String name = keyboard.nextLine();

        System.out.println("what is your age");
        int age = keyboard.nextInt();



        System.out.println("Good morning " + name);
        System.out.println("you are " + age + " years old");
        System.out.println(pival);

    }
}