import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;

public class IOStream {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bytes = inputStream.readAllBytes();
        for (byte b :
                bytes) {
            if ((b & 1) == 0) {
                outputStream.write(b);
            }
        }
        inputStream.close();
        outputStream.close();
    }
}
