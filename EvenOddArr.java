import java.util.ArrayList;
import java.util.Scanner;
public class EvenOddArr {
    static int a,b;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        System.out.println("Real Array :: ");
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = s.nextInt();
                if (arr[i][j] % 2 != 0)
                    odd.add(arr[i][j]);
                else
                    even.add(arr[i][j]);
            }
        }
        System.out.println("Array of Odd Elements :: "+odd);
        System.out.println("Array of Even Elements :: "+even);
    }
}