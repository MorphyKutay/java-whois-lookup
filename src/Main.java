import java.util.*;
import java.io.IOException;
import java.net.SocketException;
import org.apache.commons.net.whois.WhoisClient;

public class Main {
    public static void main(String[] args) throws IOException {

        WhoisClient whois = new WhoisClient();

        Scanner input = new Scanner(System.in);
        System.out.print("site adresini giriniz [google.com] : ");
        String site = input.nextLine();


        try {
            whois.connect(WhoisClient.DEFAULT_HOST);
            System.out.println(whois.query(site));
            whois.disconnect();
        } catch (IOException e) {
            System.err.println("Error I/O exception: " + e.getMessage());
            //throw new RuntimeException(e);
            //System.err.println("Baglantı Hatası domaini kontrol ediniz...");
        }


    }
}