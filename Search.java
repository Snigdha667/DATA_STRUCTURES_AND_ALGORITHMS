import java.util.Scanner;
class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data=data;
    }
}
public class Search {Nodee head;
    Nodee temp;
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
        Search obj = new Search();
        System.out.println("Element Searched : ");
        obj.search(n[2]);
    }
}