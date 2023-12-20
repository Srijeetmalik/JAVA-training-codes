import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        int no,sum=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any NUmber:");
        no=sc.nextInt();
        int nsave=no;
        while(no>0)
        {
            rem=no%10;
            sum=sum*(rem*rem*rem);
            no=no/10;
        }
        if (sum==nsave){
            System.out.println(nsave+"is armstrong");
        }
        else{
             System.out.println(nsave+"is not armstrong");
        }
        
    }
}
