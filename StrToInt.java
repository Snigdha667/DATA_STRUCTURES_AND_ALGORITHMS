import java.util.Scanner;

public class StrToInt {static int g=0;
    public static int Convert(String ss,int a){
        if(a==ss.length())
            return g;
        g=(10*g)+Character.getNumericValue(ss.charAt(a));
        return Convert(ss,a+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Convert(s.next(),0));
    }
}