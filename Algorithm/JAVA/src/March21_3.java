import java.util.Scanner;
public class March21_3 {
    public static char arr[][];
    public static boolean isVisited[][];
    public static int x;
    public static int y;

    public static void checkright(int a,int b){
        isVisited[a][b]=true;
        int na=a+1;
        if(na<x&&arr[na][b]=='-'&&!isVisited[na][b]){
            checkright(na,b);
        }
    }

    public static void checkdown(int a,int b){
        isVisited[a][b]=true;
        int nb=b+1;
        if(nb<x&&arr[a][nb]=='|'&&!isVisited[a][nb]){
            checkdown(a,nb);
        }
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        arr=new char[x][y];
        isVisited=new boolean[x][y];
        for(int i=0;i<x;i++){
            String line=s.nextLine();
            for(int j=0;j<y;j++){
                arr[i][j]=line.charAt(j);
            }
        }

        int count=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(arr[i][j]=='-'&&!isVisited[i][j]){
                    count++;
                }else if(arr[i][j]=='|'&&!isVisited[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
