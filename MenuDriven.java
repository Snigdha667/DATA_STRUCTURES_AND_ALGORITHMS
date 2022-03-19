//Menu driven program to ::
    /*
    1 -- insert at beginning ----------------------------------- _/
    2 -- insert at last      ----------------------------------- _/
    3 -- insert at any position  -------------------------------
    4 -- Delete at beginning  ---------------------------------- _/
    5 -- Delete at last       ---------------------------------- _/
    6 -- Delete at any position  -------------------------------
    7 -- Traversal of whole linked list (done by display method) _/
    8 -- searching a particular element ------------------------ _/
     */
import java.util.Scanner;
class Nnode{
    int data;
    Nnode next;
    public Nnode(int data){
        this.data=data;
    }
}
public class MenuDriven {Nnode head;
    Nnode temp;
    public void insertBegin(Nnode a){
        if(head==null){
            head=a;
            temp = head;
            System.out.println(temp.data);
            return;
        }
        while (temp!=null & temp.next!=null){
            System.out.println(temp.data);
        }
        while ( head==temp & temp.next==null){
            temp.next=temp;
            temp=a;
            System.out.println(temp.data);
            System.out.println(temp.next.data);
            break;
        }
        temp=temp.next;
        return;
    }
    public void insertEnd(Nnode a){
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
            Nnode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void insertAtAnyPos(int position, Nnode a){
        if(head==null){
            head=a;
            return;
        }
        Nnode temp = head;
        for (int i = 0; i < position-1; i++) {
            temp=temp.next;
        }
        a.next=temp.next;
        temp.next=a;
        return;
    }
    public void search(Nnode a){
        if(head==null){
            System.out.println("No element to search");
        }
        while (temp!=null & temp.next!=null){
            if(temp.data==a.data){
                System.out.println("Searched element found");
                return;
            }
            temp=temp.next;
        }
        if(temp.data==a.data){
            System.out.println("Search element found");
            return;
        }
        else {
            System.out.println("Searched element not found");
            return;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Nnode[] n = new Nnode[4];
        for (int i = 0; i < 4; i++) {
            n[i]=new Nnode(s.nextInt());
        }
        MenuDriven obj = new MenuDriven();
        System.out.println("Insert beginning :");
        obj.insertBegin(n[1]);
        System.out.println("Insert at any position(1) here :");
        obj.insertAtAnyPos(1, n[3]);
        System.out.println("Insert end : ");
        obj.insertEnd(n[0]);
        System.out.println("Delete Beginning : ");
        obj.deleteFromBeginning();
        obj.display();
        System.out.println("Element Searched : ");
        obj.search(n[2]);
        System.out.println("Delete from End : ");
        obj.deleteFromEnd();
        obj.display();
    }
}