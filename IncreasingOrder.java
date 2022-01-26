import java.util.Scanner;

public class IncreasingOrder {
    public static  int Print(int a){
       if (a<=1)
           return a;
        System.out.print(Print(a-1)+" ");
       return a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Print(s.nextInt()));
    }
}