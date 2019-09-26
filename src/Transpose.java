import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        String []str = s.split(" ");
        String [] STR = new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            STR[i]="";
            for(int j=(str[i].length()-1);j>=0;j--)
            {
                STR[i]=STR[i]+str[i].charAt(j);
            }
            System.out.print(STR[i]+" ");
        }

    }
}
