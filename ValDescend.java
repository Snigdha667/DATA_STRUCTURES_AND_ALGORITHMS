import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ValDescend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        System.out.println("Original array :: "+a);
        Comparator c = Collections.reverseOrder();
        Collections.sort(a,c);
        System.out.println("Descending Order Array :: "+a);
    }
}