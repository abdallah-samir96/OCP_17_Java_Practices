import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Resource {

    public static void main(String[] args) {
        var local = new Locale("AR", "en");
        System.out.println(local);
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("en", "US"));
        var message = rb.getString("name");
        var country = Locale.getDefault().getCountry();
        System.out.println(MessageFormat.format(message, "Abdallah", country));

    }
}
