import java.util.Scanner;

class Sumunder20{
    public static void main(String[] args) {
        int no,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any NUmber:");
        no=sc.nextInt();
        int nsave=no;
        
        for (int i=1;i<=20 ;++i ){
            if (i%2==0) {
            sum+=i;
            }
        }
            
            System.out.println(sum);
    }
}
