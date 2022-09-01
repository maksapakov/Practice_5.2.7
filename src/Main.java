import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {48, 49, 50, 51, -1, 0, 12, -25};
        InputStream inputStream = new ByteArrayInputStream(bytes);
//        System.out.println(sumOfStream(inputStream));
//        System.out.println (ReadAsString.readAsString(inputStream, StandardCharsets.US_ASCII));
        OutputStream outputStream = new ByteArrayOutputStream();
        IOStream.print(inputStream, outputStream);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() != 0) {
            byte b = (byte) inputStream.read();
            sum += b;
        }
//        for (int b :
//                bytes) {
//            sum += b;
//        }

        return sum;
    }
}
