import java.util.*;
public class NoBits {
    public void bits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur binary code: ");
        String str = sc.next();
        int count = 0;
        char ch[] = str.toCharArray();
        if(str.length()==32){
            for(int i= 0; i<str.length();i++){
                if (ch[i]=='1') {
                    count++;
                }
            }
        }
        else{
            System.out.println("binary code not 32 bits!!!");
        }
        System.out.println("no of 1's in binary code: "+count);


    }
    public static void main(String[] args) {
        NoBits n = new NoBits();
        n.bits();
    }
}