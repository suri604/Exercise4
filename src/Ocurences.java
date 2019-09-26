import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ocurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string u want ");
        String s = sc.nextLine();
        int n =s.length();
        String str = s.replaceAll("a","");
        int n1 =str.length();
        int x = n-n1;
        System.out.println(x);
    }
}
