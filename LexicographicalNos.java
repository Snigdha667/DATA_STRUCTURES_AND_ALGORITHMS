import java.util.Scanner;

public class LexicographicalNos {
    public static int Lexico(int a, int b,int i){
        if(b<=a ){System.out.print(b+" , ");
            b=b*10+i;
        }
        else {
            b = (b - i) / 10;
            while (b >= 1) {
                if (b * 10 + i < a) {
                    for (int j = 1; j <= 9; j++) {
                        System.out.print((b * 10 + j) + " , ");
                    }
                    return 1;
                        } else {
                            b = (b - i) / 10;
                        }
                    }
        }
        return Lexico(a,b,0);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.print(0+" , ");
        for (int i = 1; i <=9 ; i++) {
            Lexico(a,i,0);
            System.out.println();
        }
    }
}