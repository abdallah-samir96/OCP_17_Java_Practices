import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Chapter11 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.Category.FORMAT,new Locale("en", "US"));
        System.out.println(NumberFormat.getCurrencyInstance().format(1000));

    }

    static void manuplate() {
        /*
        var local = new Locale.Builder()
                .setLanguage("ar")
                .setRegion("EG")
                .build();

         */
        //Locale.setDefault(new Locale("en", "US"));

         Locale.setDefault(new Locale("en", "us"));
         Locale locale = new Locale("en", "CA");
         ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
         System.out.print(rb.getString("hello"));
         System.out.print(". ");
         System.out.print(rb.getString("name"));
         System.out.print(" ");
         System.out.print(rb.getString("open"));
         System.out.print(" ");
         System.out.print(rb.getString("visitors"));
    }
    public static void transform(String c) {
        try {
            System.out.println("sd");
            formatElements();
        } catch (IllegalArgumentException | ClassCastException d) {
        }
    }
    static void formatting(){
        var format = NumberFormat.getCurrencyInstance(
                new Locale.Builder()
                        .setLanguage("ar")
                        .setRegion("EG")
                        .build()
        );
        System.out.println(format.format(1000.90));
    }
    private static void local() {

        Locale locale = Locale.getDefault();
        var localBuilder = new Locale
                .Builder()
                .setLanguage("ar")
                .setRegion("EG")
                .build();

        Locale.setDefault(localBuilder);
        System.out.println(Locale.getDefault());
    }

    private static void formatElements() throws NumberFormatException{
        NumberFormat format = new DecimalFormat("###, ###.00");
        System.out.println(format.format(1000.006));

    }
    private static void check2() {

    }
    private static void check1() {

        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString());
    }
}
