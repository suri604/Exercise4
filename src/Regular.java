import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regular {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("Harry");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Matcher m = p.matcher(s);
        boolean b = false;
        int count=0;
        while(m.find())
        {
           b= true;
            count=1;
        }
        if(count==1) {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
