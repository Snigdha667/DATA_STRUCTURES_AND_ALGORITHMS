import java.util.Scanner;
public class ProductOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sizearr=Integer.parseInt(args[0]);
        int arr[]=new int[sizearr];
        for (int i = 1; i <= sizearr; i++) {
            arr[i-1]=Integer.parseInt(args[i]);
            if (i-1>0){
                if ((arr[i-1]*arr[i-2])%2!=0)
                    System.out.println("Product of "+arr[i-1]+" and "+arr[i-2]+" is equals to "+
                            (arr[i-2]*arr[i-1])+"(i. e. odd)");
            }
        }
    }
}
