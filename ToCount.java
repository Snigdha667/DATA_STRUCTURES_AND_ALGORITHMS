import java.util.Scanner;
public class ToCount {
    Scanner s = new Scanner(System.in);
    public String a = s.next();
    public void vowels(){
        int count = 0;
        char b[] = a.toCharArray();
        for(int i=0; i<b.length;i++){
            if(b[i]=='a' || b[i]=='e' || b[i]=='i' ||b[i]=='o' ||b[i]=='u'){
                count+=1;
            }
        }
        System.out.println(" No. of vowels count : "+count);
    }
    public static void main(String[] args) {
        ToCount obj = new ToCount();
        obj.vowels();
    }
}