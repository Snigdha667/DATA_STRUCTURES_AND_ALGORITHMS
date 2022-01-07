import java.util.Scanner;

public class Student {
    private int rollno;
    private String name;
    private double marks;

    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public double getMarks(){
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setMarks(double marks){
        this.marks= marks;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student a[] = new Student[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Student();
            a[i].setMarks(s.nextDouble());
            a[i].setName(s.next());
            a[i].setRollno(s.nextInt());
        }
        double max = 0;
        int ss=0;
        for (int i = 0; i < 2; i++) {
            max = 0;
            ss = 0;
            for (int j = 0; j < a.length; j++) {
                if (max <= a[j].getMarks()) {
                    max = a[j].getMarks();
                    ss = j;
                }
            }
            if (i == 0) {
                a[ss].setMarks(0);
            }
        }
        System.out.println("Second Highest Marks ::" + Double.toString(max));
        System.out.println("Name ::"+a[ss].getName());
        System.out.println("Roll No. :: "+Integer.toString(a[ss].getRollno()));

    }
}