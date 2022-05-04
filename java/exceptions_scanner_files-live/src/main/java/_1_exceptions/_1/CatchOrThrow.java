package _1_exceptions._1;

import java.io.File;
import java.io.FileInputStream;

public class CatchOrThrow {
    /*
        Compiler error in line 12 after you uncomment the code - use IntelliJ to fix it.
     */
    public static void main(String[] args) {
        File file = new File("file.txt");
        FileInputStream stream = new FileInputStream(file);
        // ...
    }
}
