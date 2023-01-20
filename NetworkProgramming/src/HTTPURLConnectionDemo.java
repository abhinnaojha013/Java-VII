import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            for (int i = 0; i < 8; i++) {
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
            }

            httpURLConnection.disconnect();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
