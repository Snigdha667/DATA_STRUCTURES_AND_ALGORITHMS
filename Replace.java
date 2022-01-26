import java.util.Scanner;

public class Replace {
    public static String Repl(String ss, char a, char b,int index){
        if(index==ss.length())
            return ss;
        if(ss.charAt(index)==a)
            ss=ss.substring(0,index)+b+ss.substring(index+1);
        return Repl(ss,a,b,index+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(Repl(s.next(),s.next().charAt(0), s.next().charAt(0),0));
    }
}