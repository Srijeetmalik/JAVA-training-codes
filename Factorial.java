import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        int no,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any NUmber:");
        no=sc.nextInt();
        int nsave=no;
        for (int i=1;i<=no ;++i )
            fact=fact*i;
      
             System.out.println(nsave+"is factorial");
    
    }
}
