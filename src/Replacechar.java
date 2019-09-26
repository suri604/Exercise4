import java.util.*;

public class Replacechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        String str = s.replaceAll("d","f").replaceAll("l","t");
        System.out.println(str);
    }
}
