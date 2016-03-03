import java.io.FileOutputStream;
import java.io.PrintStream;

public class Launcher {

    public static void main(String[] args) throws Exception {
        PrintStream out = new PrintStream(new FileOutputStream("console.txt",true));
        System.setOut(out);
        for(int i = 1; i <= 10; i++) {
            System.out.println("Sometext " + i + " times");
        }
        out.close();
   }
}
