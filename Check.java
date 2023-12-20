import java.util.Scanner;

class Check{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("enter mark one");
	int n1=sc.nextInt();
	System.out.println("enter mark two");
	int n2=sc.nextInt();
	System.out.println("enter mark three");
	int n3=sc.nextInt();



	if(n1>=45){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}

	if(n2>=45 ){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}

	if(n3>=45 ){
		System.out.println("pass");
	}
	else{
		System.out.println("fail");
	}



	}


}