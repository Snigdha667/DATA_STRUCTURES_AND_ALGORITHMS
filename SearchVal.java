public class SearchVal {
    public static int Find(int arr[],int currentIndex, int search_value){
        if (arr[currentIndex]==search_value)
            return currentIndex;
        return Find(arr,currentIndex+1,2);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,2,6};
        System.out.println(Find(arr,0,2));
    }
}