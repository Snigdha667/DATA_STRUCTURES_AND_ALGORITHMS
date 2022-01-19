import java.util.Scanner;
public class TwoArrays {
    static int a1,a2;
    static int arr1[],arr2[];
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        a1=s.nextInt();
        a2=s.nextInt();
        arr1=new int[a1];
        arr2=new int[a2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=s.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=s.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            int c=0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]<=arr2[j]){
                    c+=1;
                }
            }
            System.out.print(c+",");
        }
    }
}