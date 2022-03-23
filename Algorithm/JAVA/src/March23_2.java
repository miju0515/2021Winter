import java.util.ArrayList;
import java.util.Scanner;
public class March23_2 {
    public static ArrayList<ArrayList<Integer>> graph=new ArrayList<ArrayList<Integer>>();
    public static boolean[] isVisited;

    public static void dfs(int a){
        isVisited[a]=true;
        for(int i=0;i<graph.get(a).size();i++){
            int b=graph.get(a).get(i);
            if(!isVisited[b]){
                dfs(b);
            }
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int node=s.nextInt();
        int network=s.nextInt();
        for(int i=0;i<node+1;i++){
            graph.add(new ArrayList<Integer>());
        }

        isVisited=new boolean[node+1];

        for(int i=0;i<network;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int count=0;
        for(int i=1;i<node+1;i++){
            if(!isVisited[i]){
                count++;
                dfs(i);
            }

        }
        System.out.println(count);

    }
}
