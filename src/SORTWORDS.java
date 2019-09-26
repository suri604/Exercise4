import java.util.*;
public class SORTWORDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str =s.replaceAll(",","").replaceAll("[.]","");
        String [] S= str.split(" ");
        String temp;
        for(int i=0;i<S.length;i++)
            for(int j=i+1;j<S.length;j++)
            {
                if((S[i].compareTo(S[j]))>0)
                {
                    temp=S[i];
                    S[i]=S[j];
                    S[j]=temp;
                }
            }
        for(int i=0;i<S.length;i++)
        {
            System.out.print(S[i]+" ");
        }
    }
}
