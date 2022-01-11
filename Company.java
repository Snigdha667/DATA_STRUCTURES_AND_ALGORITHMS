import java.util.Scanner;
public class Company {
    int products[];
    public Company(int products[]) {
        this.products = products;
    }
    public static void main(String[] args) {
        Company salesman[] = new Company[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            salesman[i] = new Company(new int[]{s.nextInt(), s.nextInt(), s.nextInt()});
        }
        for (int i = 1; i <= 5; i++) {
            String ss = "";
            for(int j=0;j<3;j++){
                ss +=Integer.toString(salesman[i-1].products[j])+" ";
            }
            System.out.println("Enter the sales of 3 items sold by salesman "+i+" : " +ss);
        }
        for (int i = 1; i <= 5; i++) {
            int sum=0;
            for(int j=0;j<3;j++){
                sum+= salesman[i-1].products[j];
            }
            System.out.println("Total Sales by Salesman "+i+" : "+sum);
        }
        for (int i = 1; i <= 3; i++) {
            int sum=0;
            for(int j=0;j<5;j++){
                sum+= salesman[j].products[i-1];
            }
            System.out.println("Total Sales of item "+i+" : "+sum);
        }
    }
}