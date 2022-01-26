import java.util.Scanner;

public class NoOfDigits {
    public static int Count(int a,int c) {
        if (a/10<1)
            return c;
        return Count(a/10, c+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Count(s.nextInt(),1));
    }
}