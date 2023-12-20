import java.util.Scanner;

class Poweroffour{

    boolean powerOfFour(int n){
        
        int i=1;
        while(Math.pow(i, 4)<=n){
            if(Math.pow(i, 4)==n){
                return true;
            }
            i++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Poweroffour ob=new Poweroffour();

        System.out.println("Enter the number");
        int n=sc.nextInt();

        System.out.println(ob.powerOfFour(n));
        

    }
}