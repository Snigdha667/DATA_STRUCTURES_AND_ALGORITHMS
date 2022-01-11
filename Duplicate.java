import java.util.Scanner;
public class Duplicate {
    int a;
    int arr[];
    public Duplicate(int a){
        this.a=a;
        arr = new int[a];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Duplicate obj =  new Duplicate(s.nextInt());
        for(int i=0;i<obj.arr.length;i++){
            obj.arr[i]=s.nextInt();
        }
        for(int i=0;i<obj.arr.length;i++){
            int c=0;
            for(int j=0;j<obj.arr.length;j++){
                if (obj.arr[i]==obj.arr[j]){
                    c+=1;
                }
            }
            if (c>1){
                System.out.print(i+" ");
            }
        }
    }
}