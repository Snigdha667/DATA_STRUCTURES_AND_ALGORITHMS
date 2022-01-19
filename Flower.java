import java.util.Scanner;
public class Flower {
    String name;
    int petals;
    float price;
    public Flower(){
        name="Flower";
        price=0;
        petals=0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPetals() {
        return petals;
    }
    public void setPetals(int petals) {
        this.petals = petals;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Flower arr[]=new Flower[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=new Flower();
            arr[i].setName(s.next());
            arr[i].setPetals(s.nextInt());
            arr[i].setPrice(s.nextFloat());
            System.out.println(arr[i].getName()+" has "+arr[i].getPetals()+" no. of petals and its price is "+arr[i].getPrice());
        }
    }
}