import java.util.Scanner;

public class ConsecutiveDuplicates {
    public static String Remove(String ss,int index) {
        if(index==ss.length())
            return ss;
        if(ss.charAt(index)==ss.charAt(index-1))
            ss=ss.substring(0,index)+ss.substring(index+1);
        return Remove(ss,index+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Remove(s.next(),1));
    }
}