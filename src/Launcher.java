import java.io.FileOutputStream;

public class Launcher {

    public static void main(String[] args) throws Exception {
        FileOutputStream file = new FileOutputStream("console.txt", true);
        TeePrintStream tee = new TeePrintStream(file, System.out);
        System.setOut(tee);

//        PrintStream out = new PrintStream(new FileOutputStream("console.txt",true));
//        System.setOut(out);
        for(int i = 1; i <= 10; i++) {
            System.out.println("Sometext " + i + " times");
        }
//        out.close();
   }
}
