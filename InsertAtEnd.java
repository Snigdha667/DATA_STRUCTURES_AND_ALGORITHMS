import java.util.Scanner;
class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data=data;
    }
}
public class InsertAtEnd {Nodee head;
    Nodee temp;
    public void insertEnd(Nodee a){
        if(head==null){
            head=a;
            temp = head;
            System.out.println(temp.data);
            return;
        }
        while (temp!=null & temp.next!=null){
            System.out.println(temp.data);
        }
        while ( temp!=null & temp.next==null){
            temp.next=a;
            System.out.println(temp.data);
            System.out.println(temp.next.data);
            break;
        }
        temp=temp.next;
        return;
    }
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nodee[] n = new Nodee[3];
        for (int i = 0; i < 3; i++) {
            n[i]=new Nodee(s.nextInt());
        }
        InsertAtEnd obj = new InsertAtEnd();
        System.out.println("Insert end : ");
        obj.insertEnd(n[0]);
    }
}