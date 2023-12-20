import java.util.Scanner;
class Myjava{
    public void voting(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc1.nextInt();
        if (age>=18){
            System.out.println("Eligible for vote");
        }
        if (age<=18){
            System.out.println("Not Eligible for vote");
        }
    }
    public static void main(String[] args){
        Myjava m=new Myjava();
        m.voting();
    }
}









