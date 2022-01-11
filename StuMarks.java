import java.util.Scanner;
public class StuMarks {
    int marks[][] = new int[4][5];
    public StuMarks(){
        Scanner s = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                marks[i][j]= s.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        StuMarks obj = new StuMarks();
        int c=0;
        for(int i=0;i<5;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum+=obj.marks[j][i];
            }
            System.out.println("Average marks obtained in subject "+(i+1)+" : "+(sum/4));
        }
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<5;j++){
                sum+=obj.marks[i][j];
            }
            System.out.println("Average marks obtained by student "+(i+1)+" : "+(sum/5));
            if ((sum/5)<50){
                c+=1;
            }
        }
        System.out.println("No. of Students who have scored below 50 on their average :: "+c);
        for(int i=0;i<4;i++) {
            System.out.print("Scores obtained by Student "+(i+1)+" : ");
            for (int j = 0; j < 5; j++) {
                System.out.print(obj.marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}