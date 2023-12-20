import java.util.Scanner;
public class  MissingNumber
{
    public int find(int []num)
    {
        for (int i=0;i<=num.length;i++)
        {
            for (int j=0;j<num.length;j++)
            {
                if (i==num[j])
                {
                    continue;
                }
                else
                {
                    return i;
                }
            }
        }
        return 0;
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        MissingNumber obj = new MissingNumber();
        System.out.println("Enter array length:");
        int l=in.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[l];
        for (int i=0;i<l;i++)
        {
            arr[i]=in.nextInt();
        }
        int result = obj.find(arr);
        System.out.println(result);
    }
}