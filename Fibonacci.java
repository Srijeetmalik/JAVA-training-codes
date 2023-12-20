import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        int f0=0,f1=1,f2,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range:");
        n=sc.nextInt();
        System.out.println(f0+"\t"+f1);
        int nsave=n;
        
        for (int i=3;i<=n ;++i ){
            f2=f0+f1;
            System.out.println("\t"+f2);
            f0=f1;
            f1=f2;
            }
        }
}