import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class findmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s = sc.nextLine();
        Pattern p = Pattern.compile("ese");
        Matcher m = p.matcher(s);
        while(m.find()) {
            System.out.println("FOUND at " + m.start() + " to "+m.end());
        }
    }
}
