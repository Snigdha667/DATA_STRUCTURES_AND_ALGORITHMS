import java.util.Scanner;

public class abString {
    public static boolean Check(String ss,int index) {
        char a = 'a';
        String b = "bb";
        if(index+1==ss.length()){
            if (ss.charAt(index-1) == a) {
                if (ss.charAt(index) == 'b')
                    return false;
            }
            else
                return true;
        }
        if (ss.charAt(index-1) == a) {
            if(index+2<=ss.length()) {
                if ((ss.charAt(index ) == a) | (ss.substring(index , index + 2).equals(b)))
                    return Check(ss,index+1);
            }
            else{
                if ((ss.charAt(index ) == a) | (ss.substring(index ).equals(b)))
                    return Check(ss, index+1);

            }
        }
        else if (ss.substring(index-1, index+1).equals(b)) {
            if (ss.charAt(index+1) == a)
                return Check(ss,index+2);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Check(s.next(),1));
    }
}