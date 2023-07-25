import java.util.Scanner;

public class july04_2 {
    static int arr[][]=new int[31][31];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt()-1;
        int K=sc.nextInt()-1;

        System.out.println(dp(N,K));

    }
    static int dp(int n,int k){
        if(arr[n][k]>0){
            return arr[n][k];
        }
        if(n==k||k==0){
            return arr[n][k]=1;
        }
        return arr[n][k]=dp(n-1,k-1)+dp(n-1,k);
    }
}
