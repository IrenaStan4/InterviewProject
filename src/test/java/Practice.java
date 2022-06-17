import java.sql.Driver;
import java.util.SplittableRandom;

public class Practice {

    public static void main(String[] args) {

        System.out.println(StrReverse("abc"));

    }


    public static String StrReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;


    /*
    public static void main(String[] args) {
        String rev = "";
        String st = "abc";
        for (int i = 0; i < st.length(); i++) {
            rev = st.charAt(i) + rev;

        }
        System.out.println(rev);
    }
     */

    }

}
