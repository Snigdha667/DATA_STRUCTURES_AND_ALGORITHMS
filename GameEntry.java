import java.util.Scanner;
public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score, String name){
        this.name=name;
        this.score=score;
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "( "+score+" , "+name+" )";
    }
    public static void main(String[] args) {
        int b=0;
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
        GameEntry arr[]=new GameEntry[a];
        for (int i = 0; i < a; i++) {
            arr[i] = new GameEntry(s.nextInt(), s.next());
        }
        for (int j = 0; j < a; j++) {
            int max=0;
            for (int i = 0; i < a; i++) {
                if (arr[i].getScore() > max) {
                    max = arr[i].getScore();
                    b = i;
                }
            }
            System.out.println(arr[b].toString());
            arr[b].score=0;
        }
    }
}