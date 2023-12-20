import java.util.Scanner;
class Myjava{
    public void number(){
        Scanner sc1-new Scanner(System.in);
        System.out.pritnln("Enter Age:");
        int age=sc1.nexInt();
        if (age>=18){
            System.out.pritnln("Eligible for vote");
        }
        if (age<=18){
            System.out.pritnln("Not Eligible for vote");
        }
    }
    public static void main(String[] args){
        Myjava m=new Myjava();
       m.voting();
    }
}









