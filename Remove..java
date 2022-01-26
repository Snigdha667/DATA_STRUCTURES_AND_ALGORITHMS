import java.util.Arrays;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),remele=s.nextInt();
        int arr[]= new int[a];
        int remarr[] = new int[a-1];
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i <arr.length ; i++) {
            if(c==0)
                remarr[i-1]=arr[i-1];
            else
                remarr[i-1]=arr[i];
            if(arr[i-1]==remele){
                c=1;
                remarr[i-1]=arr[i];
            }
        }
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Array after removal of "+remele+" : "+Arrays.toString(remarr));
    }
}