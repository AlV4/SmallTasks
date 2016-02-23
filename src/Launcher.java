import java.io.ByteArrayInputStream;

public class Launcher {

    public static void main(String[] args) throws Exception {

        byte[] bytes = {102, 16, 35, 0, -1, 12, 18, -40, -58, 113, 2, 0};

        ByteArrayInputStream stream = new ByteArrayInputStream(bytes);

        printStreamData(stream);
    }

    public static void printStreamData(ByteArrayInputStream stream) {
        int i;
        System.out.print("[ ");
        while ((i = stream.read()) != -1) {
            byte b = (byte) i;
            System.out.print(b + " ");
        }
        System.out.println("]");
    }
}
