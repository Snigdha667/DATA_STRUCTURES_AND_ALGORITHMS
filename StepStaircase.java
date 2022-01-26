import java.util.Scanner;

public class StepStaircase {
    public static int PossibleWays(int n,int a,int b){
        int k=0;
        if(a>3)
            return b;
        if(a==1) {
            b++;
            if (n%2!=0){
                if (n-2>2) {
                    k=(n-2)/2;
                    b+=k*3;
                }
            }
        }
        else if(a==2){
            if (n%2==0) {
                b++;
                if (n-2>2) {
                    k=(n-2)/2;
                    b+=k*3;}
            }
            if (n>=4)
                b+=3*(n-4+1);
            else
                b += n - 1;}
        else if(a==3){
            if (n % 3 == 0){
                b++;
                if (n >3)
                    b+=6*(6-n+1);}
            else
                if(n%2==0)
                    if(n>=4)
                        b+=2*(n-4+1);
                else
                        b += n - 1;}
        return PossibleWays(n,a+1,b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(PossibleWays(s.nextInt(),1,0));
    }
}