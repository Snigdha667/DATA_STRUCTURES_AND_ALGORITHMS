import java.util.Scanner;

public class XpowerN {
    public static int Power(int x, int n,int p){
        if(n<=1)
            return  p*x;
        int c=Power(x,n-1,p );
        p=c;
        return  x*c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Power(s.nextInt(), s.nextInt(),1));
    }
}