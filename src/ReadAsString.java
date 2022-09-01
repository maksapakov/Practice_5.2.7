import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsString {
public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    char[] buffer = new char[1024];
    StringBuilder out = new StringBuilder();
    Reader in = new InputStreamReader(inputStream, charset);
    for (int numRead; (numRead = in.read(buffer, 0, buffer.length)) > 0; ) {
        out.append(buffer, 0, numRead);
    }
    return out.toString();
}
}
