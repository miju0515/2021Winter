import java.util.Scanner;

public class B11660 {

    static int[][] arr;
    static int[][] S;

    static int result(int x1,int y1,int x2,int y2){
        return S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        arr=new int [N+1][N+1];
        S=new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                S[i][j]=S[i][j-1]+S[i-1][j]-S[i-1][j-1]+arr[i][j];
            }
        }

        for(int i=0;i<M;i++){
            System.out.println(result(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }

    }
}
