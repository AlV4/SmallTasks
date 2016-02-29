import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) throws Exception {

        File fileSource = new File("file.txt");
        List<String> list = new ArrayList<>();
        list.add("12345 enter");
        list.add("12345 out");
        list.add("54321 IIIIIIIIII");
        list.add("12345 enter");
        list.add("12345 out");
        list.add("54321 IIII");
        FileWriter writer = new FileWriter(fileSource);
        for(String str: list) {
            writer.write(str + " \n");
        }
        writer.close();

        copyFile(fileSource, new File("somefile.txt"));


   }
    private static void copyFile(File source, File dest){
        try(
                InputStream is = new FileInputStream(source);
                OutputStream os = new FileOutputStream(dest + ".copy")) {

            byte[] buffer = new byte[256];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e){
           e.printStackTrace();
        }
    }
}
