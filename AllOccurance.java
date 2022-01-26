import java.util.Arrays;

public class AllOccurance {static int i=0;
    static int a[]=new int[5];
    public static int[] Res(int arr[],int currentIndex,int search_value){
        if(currentIndex==arr.length)
            return a;
        if(arr[currentIndex]==search_value) {
            a[i] = currentIndex;
            i++;
        }
        return Res(arr,currentIndex+1,7);
    }
    public static void main(String[] args) {
        int arr[]={1,7,4,7,6};
        System.out.println(Arrays.toString(Res(arr,0,7)));
    }
}