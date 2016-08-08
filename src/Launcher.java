import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Launcher {

    public static void main(String[] args) {
        URL url;
//        InputStream is = null;
//        BufferedReader br;
        String line;

        try {
            url = new URL("http://google.com/");
            URLConnection conn = url.openConnection();
            BufferedInputStream buffer = new BufferedInputStream(conn.getInputStream());

            StringBuilder builder = new StringBuilder();
            int byteRead;
            while ((byteRead = buffer.read()) != -1) {
                builder.append((char) byteRead);
            }

            buffer.close();

            System.out.println(builder.toString());
            System.out.println("The size of the web page is " + builder.length() + " bytes.");

//            is = url.openStream();  // throws an IOException
//            br = new BufferedReader(new InputStreamReader(is));

//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}
