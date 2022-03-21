import java.util.Scanner;
import java.util.Arrays;
public class March21_2 {
    public static int plusx[]={0,0,1,-1};
    public static int plusy[]={1,-1,0,0};
    public static boolean isVisited[][];
    public static int arr[][];
    public static int count[]=new int[27*27];
    public static int house=0;
    public static int number=0;

    public static void dfs(int x,int y){
        //System.out.println("("+x+" , "+y+")");
        count[house]++;
        isVisited[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+plusx[i];
            int ny=y+plusy[i];
            if(nx>=0&&ny>=0&&nx<number&&ny<number) {
                if (arr[nx][ny] == 1 && !isVisited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        number=s.nextInt();
        arr=new int[number][number];
        isVisited=new boolean[number][number];


        for(int i=0;i<number;i++) {
            String line = s.next();
            for (int j = 0; j < number; j++) {
                arr[i][j] = line.charAt(j) - 48;
            }
        }


        //순회
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++){
                if(arr[i][j]==1&&!isVisited[i][j]){
                    house++;
                    dfs(i,j);

                }
            }
        }

        //출력
        Arrays.sort(count);
        System.out.println(house);
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.println(count[i]);
            }

        }

    }

}
