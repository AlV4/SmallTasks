import java.io.*;
import java.nio.file.Files;

public class Launcher {

    public static void main(String[] args) throws Exception {

        File file = new File("file.txt");
        java.nio.file.Path path = file.toPath();

        try (InputStream in = Files.newInputStream(path)) {
            printStreamData(in);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void printStreamData(InputStream stream) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

}
