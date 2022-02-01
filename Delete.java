import java.util.Scanner;
class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data=data;
    }
}
public class Delete {Nodee head;
    Nodee temp;
public void deleteFromBeginning(){
        if(head==null){
            System.out.println("Empty Linked List");
        }
        else{
            head = head.next;
        }
    }
    public void deleteFromEnd(){
        if(head==null){
            System.out.println("Empty Linked List");
            return;
        }
        while (temp!=null & temp.next!=null){
            temp=temp.next;
        }
        if(temp==head)
            head=null;
        if(temp!=null & temp.next==null){
            temp=null;
        }
        return;
    }
    public void display() {
        if (head == null) {
            System.out.println("No element");
        } else {
            Nodee temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nodee[] n = new Nodee[3];
        for (int i = 0; i < 3; i++) {
            n[i]=new Nodee(s.nextInt());
        }
        Delete obj = new Delete();
        System.out.println("Delete Beginning : ");
        obj.deleteFromBeginning();
        obj.display();
        System.out.println("Delete from End : ");
        obj.deleteFromEnd();
        obj.display();
    }
}