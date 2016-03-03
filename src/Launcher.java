import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String[] args) throws Exception {


        List<String> list = getStringsList();

        File fileSource = writeToFile(new File("file.txt"), list);

//        copyFile(fileSource, new File("somefile.txt"));


        changeEncoding(fileSource, Charset.defaultCharset().toString(), "UTF_32");
   }

    private static void changeEncoding(File fileSource, String currentEncoding, String desiredEncoding) throws IOException {

        try(Reader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileSource), Charset.forName(currentEncoding)));
            Writer out = new OutputStreamWriter(new FileOutputStream(fileSource + "newCoding.txt"), desiredEncoding);) {

            StringBuilder buffer = new StringBuilder();
            int ch;
            while ((ch = in.read()) > -1) {
                buffer.append((char) ch);
            }
            out.write(buffer.toString());
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    private static List<String> getStringsList() {
        List<String> list = new ArrayList<>();
        list.add("12345 enter");
        list.add("12345 out");
        list.add("54321 IIIIIIIIII");
        list.add("12345 enter");
        list.add("12345 out");
        list.add("@@@@@@@@@@");
        return list;
    }

    private static File writeToFile(File file, List<String> list) throws IOException {

        FileWriter writer = new FileWriter(file, true);
        for(String str: list) {
            writer.write(str + " \n");
        }
        writer.close();
        return file;
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
