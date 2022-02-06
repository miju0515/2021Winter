package algorithm;
import java.util.Scanner;
public class feb06two {
	// BOJ 1463
	static Integer dp[];
	static int solve(int N) {
		if(dp[N] == null) {
			if(N%3==0) {
				dp[N]=Math.min(solve(N-1), solve(N/3))+1;
			}else if(N%2==0) {
				dp[N]=Math.min(solve(N-1), solve(N/2))+1;
			}else {
				dp[N]=solve(N-1)+1;
			}
		}
		return dp[N];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int X=s.nextInt();
		dp=new Integer[X+1];
		dp[0]=dp[1]=0;
		System.out.print(solve(X));
	}

}
