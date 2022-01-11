import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int c=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c+=1;
            }
            if(arr[i+1]==arr[i] & arr[i]!=0){
                for(int k =1;k<c;k++){
                    arr[i+k]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                System.out.print(arr[i]+" ");
            }
    }
}