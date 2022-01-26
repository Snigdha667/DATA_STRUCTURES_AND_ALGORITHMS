import java.util.Scanner;
public class SubString {
    public static String SubStr(String ss,int index) {
        if(ss.length()==2)
            return ss;
        System.out.println(ss.charAt(index));
        ss=ss.substring(0,index)+ss.substring(index+1);
        System.out.println(ss);
        return SubStr(ss,0);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss=s.next();
        System.out.println(ss);
        System.out.println(" ");
        for (int i = 0; i < ss.length(); i++) {
            SubStr(ss,i);
        }
    }
}
