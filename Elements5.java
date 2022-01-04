public class Elements5 {
    public int[] a = {1,2,3,4,5};
    public static void main(String[] args) {
        Elements5 obj = new Elements5();
        for(int i=0; i<obj.a.length;i++){
            if((obj.a[i]%3==0)||(obj.a[i]%5==0)){
                System.out.println(obj.a[i]);
            }
        }
    }
}