import java.util.*;
public class ques4 {
    public static void str(String str)
    {
        str=str.trim();
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch= str.charAt(i);
            int a;
            if(ch>='A'&&ch<='Z')
            {
                a=(int)ch;
                System.out.print((char)(a+32));
            }
            else
                System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("The length is "+str.length());
    }
    public static void main(String[] args) {
        System.out.println("Enter your String");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("The modified string is");
        str(s1);
    }
}
