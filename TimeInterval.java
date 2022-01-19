import java.util.Arrays;
import java.util.Scanner;
public class TimeInterval {
    static int start[],end[],a;
    public boolean canAttendMeeting() {
        Arrays.sort(start);
        Arrays.sort(end);
        int c = 0;
        for (int i = 1; i < a; i++) {
            if (start[i] >= end[i - 1]) {
                c += 1;
            }
        }
        if (c == a - 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        TimeInterval obj = new TimeInterval();
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        start=new int[a];
        end =new int[a];
        for (int i = 0; i < a; i++) {
            start[i]=s.nextInt();
            end[i]=s.nextInt();
        }
        if(obj.canAttendMeeting())
            System.out.println("no clashes are there");
        else
            System.out.println("clashes are there");
    }
}