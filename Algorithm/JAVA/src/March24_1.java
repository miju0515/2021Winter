import java.util.Scanner;

public class March24_1 {
    public static int arr[][];
    public static boolean isVisited[][];
    public static int[] movex=new int[] {0,0,1,-1,1,-1,-1,1};
    public static int[] movey=new int[] {1,-1,0,0,1,-1,1,-1};
    public static int weight;
    public static int height;

    public static void dfs(int a,int b){
        isVisited[a][b]=true;
        for(int i=0;i<8;i++){
            int nx=a+movex[i];
            int ny=b+movey[i];
            if(nx>=0 && ny>=0 && nx<weight && ny<height){
                if(arr[nx][ny]==1 && !isVisited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
            weight=s.nextInt();
            height=s.nextInt();
            if(weight==0&&height==0){
                break;
            }
            arr=new int[weight][height];
            isVisited=new boolean[weight][height];
            for(int i=0;i<weight;i++){
                for(int j=0;j<height;j++){
                    arr[i][j]=s.nextInt();
                }
            }
            int count=0;
            for(int i=0;i<weight;i++){
                for(int j=0;j<height;j++){
                    if(arr[i][j]==1 && !isVisited[i][j]){
                        count++;
                        dfs(i,j);
                    }
                }
            }
            System.out.println(count);
        }
    }

}
