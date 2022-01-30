public class PermutString {
    public static String PermutationVal(String ss,String a) {
        if(ss.length()==0){
            System.out.println(a);
            return null;}
        for (int i = 0; i < ss.length(); i++) {
            char c=ss.charAt(i);
            String rem=ss.substring(0,i)+ss.substring(i+1);
            PermutationVal(rem,a+c);
        }
        return null;
    }
    public static void main(String[] args) {
        PermutationVal("abc","");
    }
}