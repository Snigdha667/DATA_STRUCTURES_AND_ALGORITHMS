import java.util.*;

public class InteriorDesigners {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Leads> lead= new ArrayList<Leads>();
        for (int i = 0; i < 5; i++) {
            lead.add(new Leads());
            System.out.println(lead.get(i).location+" At "+i+" lead");
            System.out.println(Arrays.toString(lead.get(i).L));
        }
        List<Designers> designer= new ArrayList<Designers>();
        for (int i = 0; i < 3; i++) {
            designer.add(new Designers());
            System.out.println(designer.get(i).location+" At "+i+" designer");
            System.out.println(Arrays.toString(designer.get(i).D));
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(lead.get(j).location==designer.get(i).location){
                    List<String> asgnDes= new ArrayList<>();
                    for (String l: lead.get(j).L) {
                        for (String d:designer.get(i).D) {
                            if(d==l){
                                asgnDes.add(designer.get(i).location);
                                designer.get(i).lastLeadAssigned+=lead.get(j).name+" ";
                            }
                        }
                    }
                    lead.get(j).AssignedDesigners=asgnDes.toArray(new String[asgnDes.size()]);
                }
                System.out.println(".....................................................................");
                System.out.println(designer.get(i).lastLeadAssigned+" At "+i+" lead");
                System.out.println(Arrays.toString(lead.get(j).AssignedDesigners));
                }
            }
        }
}
class Leads{Scanner s = new Scanner(System.in);
    String id;
    String name;
    String email;
    String zipcode;
    String phnNo;
    String tags;
    String location;
    String AssignedDesigners[];
    //String projectTypeIds[];
    String Date;
    String[] L;
    Leads() {
        this.id = s.next();
        this.name = s.next();
        this.email = s.next();
        this.zipcode = s.next();
        this.phnNo = s.next();
        this.tags = s.next();
        this.location = s.next();
        //this.projectTypeIds[]=projectTypeIds[];
        //this.AssignedDesigners = s.next();
        this.Date = s.next();
        List<String> projectTypeIds = new ArrayList<>();
        int nl11 = s.nextInt();
        for (int i = 0; i < nl11; i++) {
            projectTypeIds.add(s.next());
        }
        this.L= projectTypeIds.toArray(new String[projectTypeIds.size()]);
    }
class Designers{
     // public static List<String> projectTypeIds;
      Scanner s = new Scanner(System.in);
    String id;
    //String projectTypeIds[];
    String location;
    String email;
    String phnNo;
    String lastLeadAssigned="";
    String portfolio;
    String accountId;
    String[] D;
    Designers() {
        this.id = s.next();
       //this.projectTypeIds[]=projectTypeIds;
        this.location = s.next();
        this.email =s.next();
        this.phnNo =s.next();
        //this.lastLeadAssigned = s.next();
        this.portfolio =s.next();
        this.accountId = s.next();
        List<String> projectTypeIds= new ArrayList<>();
        int nd1 = s.nextInt();
        for (int i = 0; i < nd1; i++) {
            projectTypeIds.add(s.next());
        }
        this.D= projectTypeIds.toArray(new String[projectTypeIds.size()]);
    }
}