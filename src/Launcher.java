import java.io.File;
import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws Exception {

        String filename = "D:/FolderCreatedByJava/test.txt";
        filename.replace("/", File.pathSeparator);
        File file = new File(filename);
        if (file.getParentFile().mkdir()) {
            file.createNewFile();
        } else {
            throw new IOException("Failed to create directory " + file.getParent());
        }
        File userdir = new File(System.getProperty("user.dir"));
        userdir.mkdir();
        String[] dirs = userdir.list();
        for (String name : dirs){
            System.out.println(name);
        }
   }
}
