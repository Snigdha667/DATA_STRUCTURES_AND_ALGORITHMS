import java.util.Scanner;
class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data=data;
    }
}
public class SinglyLinkedList {Nodee head;
    Nodee temp;
    public void insertBegin(Nodee a){
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

    public void search(Nodee a){
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
        Nodee[] n = new Nodee[3];
        for (int i = 0; i < 3; i++) {
            n[i]=new Nodee(s.nextInt());
        }
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println("Insert beginning :");
        obj.insertBegin(n[1]);
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