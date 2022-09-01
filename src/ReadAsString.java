import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream, charset);
        while (in.ready()) {
            out.append((char) in.read());
        }
        return out.toString();
    }
}
