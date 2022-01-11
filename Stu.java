import java.util.Scanner;
public class Stu{
    private int rollno;
    private int marks;
    private String name;
    public Stu(int rollno, int marks, String name){
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Stu arr[] = new Stu[10];
        for(int i=0;i<10;i++){
            arr[i]= new Stu(s.nextInt(),s.nextInt(),s.next());
        }
        int max=0;
        int min = arr[0].marks;
        for(int i=0;i<10;i++){
            if(arr[i].marks>max){
                max=arr[i].marks;
            }
            if(arr[i].marks<min){
                min=arr[i].marks;
            }
        }
        for(int i=0;i<10;i++){
            if(arr[i].marks==max){
                System.out.println("Max marks :: "+arr[i].marks);
                System.out.println("Name :: "+arr[i].name);
                System.out.println("Roll no. :: "+arr[i].rollno);
            }
            if(arr[i].marks==min){
                System.out.println("Min marks :: "+arr[i].marks);
                System.out.println("Name :: "+arr[i].name);
                System.out.println("Roll no. :: "+arr[i].rollno);
            }
        }
    }
}