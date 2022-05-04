package _2_scanner;

import java.util.Scanner;

/*
    TODO this app has a bug - fix it! :)
 */
public class _2_InfiniteInput {
    public static void main(String[] args) {
        int num = 0;
        boolean loop = true;

        Scanner scanner = new Scanner(System.in);
        while (loop) {
            try {
                System.out.println("############################");
                System.out.println("Input an int: (-333 to exit)");
                System.out.println("############################\n");
                num = scanner.nextInt();
                System.out.println("The input value is: " + num +"\n");
                if(num == -333) {
                    System.out.println("Good bye!");
                    loop = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid value!");
            }
        }

    }
}
