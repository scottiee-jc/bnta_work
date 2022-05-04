package _2_scanner;

import java.util.Scanner;

public class _1_OneTimeInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What's your first name?: ");
        // Grab single word string...
        String name = in.next();
        System.out.println("Hello " + name + "!");

        System.out.print("And your age?: ");
        // Integer...
        int age = in.nextInt();
        System.out.println(age + "! You look younger.");

        System.out.print("Write anything: ");
        // Long line as a String object;
        String anything = in.next();
        System.out.println("Did you just say... " + anything + "?");

        /*
            TODO run the app and play wit it.

            As you may notice  an answer to 'And your age?' May cause an exception (e.g. hello) - fix it!
         */
    }
}
