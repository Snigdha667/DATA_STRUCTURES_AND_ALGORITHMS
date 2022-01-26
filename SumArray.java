import java.util.Scanner;

public class SumArray {
    public static int Count(int a[],int s,int sum){
        if (s==0)
            return sum+a[0];
        sum+=a[s];
        return Count(a,s-1,sum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for (int i = 0; i < a; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Count(arr,a-1,0));
    }
}