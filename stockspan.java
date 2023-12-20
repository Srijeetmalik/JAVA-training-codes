import java.util.Arrays;
public class stockspan {
    public static void main(String[] Args) {
        int price[] = new int[]{100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[7];
        span[0]=1;
        int l=1;
        for (int i = 1; i < 7; i++) {
            if(price[i]<price[i-1])
            {
                span[l++]=1;
            }
            else
            {
                span[l++]=2*2*2;
            }
        }
        System.out.println(Arrays.toString(span));
    }
}
