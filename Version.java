import java.util.*;
class Ver{
	 
	public void isBadVersion(int version , int  x){
		//int i;
		for(int i=0;i<x;i++){
			if (i<version){
				System.out.println("False");
			}
			else {
				System.out.println("True");
			}
		} 
		
	}
}
class BadVer{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of versions:");
		int a=sc.nextInt();
		System.out.print("Enter the bad version:");
		int b=sc.nextInt();
		Ver v=new Ver();
		v.isBadVersion(b,a);
	}
}
