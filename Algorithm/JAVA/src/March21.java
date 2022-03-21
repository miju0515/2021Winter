import java.util.ArrayList;
import java.util.Scanner;
public class March21 {
    public static boolean isvisited[];
    public static ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
    public static int count=0;

    public static void dfs(int x, boolean visited){
        isvisited[x]=true;
        count++;
        for(int i=0;i<graph.get(x).size();i++){
            int y=graph.get(x).get(i);
            if(!isvisited[y]){
                dfs(y,isvisited[y]);
            }
        }
    }


    public static void main(String[] args){
        // BOJ 2606 바이러스
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int network=s.nextInt();

        for(int i=0;i<number+1;i++){
            graph.add(new ArrayList<Integer>());
        }

        isvisited=new boolean[number+1];

        for(int i=0;i<network;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        dfs(1,isvisited[1]);
        System.out.println(count-1);


    }

}
