import java.util.Scanner;

public class Occurence
{
    public void remove (String s,String x)
    {
        char c=x.charAt(0);
        String st="";
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=c)
            {
                st=st.concat(Character.toString(s.charAt(i)));
            }
        }
        System.out.println(st);
    }
    public static void main(String []args)
    {
        Scanner in =new Scanner(System.in);

       Occurence obj =new  Occurence();
        System.out.println("Enter string");
        String s=in.nextLine();
        System.out.println("Enter x to be removed");
        String x=in.next();
        obj.remove(s,x);
    }
}