import java.util.Scanner;
 class March23_1 {
     public static int[][] arr;
     public static boolean[][] isVisited;
     public static int[] movex=new int[] {0,0,1,-1};
     public static int[] movey=new int[] {1,-1,0,0};
     public static int N;
     public static int M;

     public static void dfs(int a,int b){
         isVisited[a][b]=true;
         for(int i=0;i<4;i++){
             int nx=a+movex[i];
             int ny=b+movey[i];
             if(nx>=0&&nx<N&&ny>=0&&ny<M){
                 if(arr[nx][ny]==1&&!isVisited[nx][ny]){
                     dfs(nx,ny);
                 }
             }
         }
     }

     public static void main (String[] args){
         Scanner s=new Scanner(System.in);
         int T=s.nextInt();

         for(int i=0;i<T;i++){
             int count=0;
             N=s.nextInt();
             M=s.nextInt();
             int K=s.nextInt();
             arr=new int[N][M];
             isVisited=new boolean[N][M];
             for(int j=0;j<K;j++){
                 int x=s.nextInt();
                 int y=s.nextInt();
                 arr[x][y]=1;
             }
             for(int c=0;c<N;c++){
                 for(int d=0;d<M;d++){
                     if(arr[c][d]==1&&!isVisited[c][d]){
                         count++;
                         dfs(c,d);
                     }
                 }
             }
             System.out.println(count);
         }

     }

}
