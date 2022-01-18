import java.util.Scanner;
public class Employee {
    int emp_id;
    Name name;
    Address address;
    double salary;
    String designation;
    Employee(int emp_id,double salary,String designation){
        this.emp_id=emp_id;
        this.salary=salary;
        this.designation=designation;
    }
    static Employee arr[]=new Employee[2];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //To Read the data
            arr[i] = new Employee(s.nextInt(),s.nextDouble(),s.next());
            arr[i].name=new Name(s.next(), s.next());
            arr[i].address=new Address(s.next(), s.next(),s.next());
            //To Print the data
            System.out.println("Information of Employee "+(i+1)+" is as follows ::");
            System.out.println("Id :: "+arr[i].emp_id+" , Name :: "+arr[i].name.first_name+" "+arr[i].name.last_name+
                            " , Address :: "+arr[i].address.area+" , "+arr[i].address.city+" , "+arr[i].address.state);
            System.out.println("Salary :: "+arr[i].salary+" , Designation :: "+arr[i].designation);
        }
    }
}
class Name{
    String first_name;
    String last_name;
    Name(String first_name,String last_name){
        this.first_name=first_name;
        this.last_name=last_name;
    }
}
class Address{
    String area;
    String city;
    String state;
    Address(String area, String city, String state){
        this.area=area;
        this.city=city;
        this.state=state;
    }
}