
import java.util.Scanner;

public class july04 {
        static int[][] arr = new int [30][30];


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int T=sc.nextInt();
            int answer[]=new int[T];
            for(int i=0;i<T;i++){
                int N=sc.nextInt();
                int M=sc.nextInt();
                answer[i]=dp(M,N);
            }
            for(int i=0;i<T;i++){
                System.out.println(answer[i]);
            }
        }

        static int dp(int n,int m){
            if(arr[n][m]>0){
                return arr[n][m];
            }

            if(n==m || m==0){
                return arr[n][m]=1;
            }
            return arr[n][m]=dp(n-1,m-1)+dp(n-1,m);
        }


}
