import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        int no,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any NUmber:");
        no=sc.nextInt();
        int nsave=no;
        while(no>0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        if (rev==nsave){
            System.out.println(nsave+"is palindrome");
        }
        else{
             System.out.println(nsave+"is not palindrome");
        }
        
    }
}
