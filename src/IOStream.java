import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
//        byte[] bytes = inputStream.readAllBytes();
        while (inputStream.available() != 0) {
            int inRead = inputStream.read();
            if ((inRead & 1) == 0) {
                outputStream.write(inRead);
            }
        }
/*
        for (byte b :
                bytes) {
            if ((b & 1) == 0) {
                outputStream.write(b);
            }
        }
*/
        inputStream.close();
        outputStream.close();
    }
}
