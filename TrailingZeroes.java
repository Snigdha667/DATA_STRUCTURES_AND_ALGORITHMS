import java.util.Scanner;
public class TrailingZeroes {
    static int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        int x[] = new int[n];
        int i = 0;
        while (a > 1) {
            x[i] = a % 10;
            a /= 10;
            i++;
        }
        i=0;
        for (int j = 0; j < n; j++) {
            if(x[i]==0)
                i+=1;
            else
                break;
        }
        System.out.println(i);
    }
}