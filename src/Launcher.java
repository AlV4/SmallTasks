import java.io.*;
import java.nio.file.Files;

public class Launcher {

    public static void main(String[] args) throws Exception {

        byte[] bytes = {102, 16, 35, 0, -1, 12, 18, -40, -58, 113, 2, 0};

        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);

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
