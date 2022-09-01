import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {48, 49, 50, 51};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println (ReadAsString.readAsString(inputStream, StandardCharsets.US_ASCII));
/*
        OutputStream outputStream = new ByteArrayOutputStream();
        IOStream.print(inputStream, outputStream);
*/
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        byte[] bytes = inputStream.readAllBytes();
        for (byte b :
                bytes) {
            sum += b;
        }

        return sum;
    }
}
