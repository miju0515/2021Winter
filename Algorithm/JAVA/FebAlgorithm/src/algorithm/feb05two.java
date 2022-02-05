package algorithm;
import java.util.Scanner;
public class feb05two {
	public static void main(String[] args) {
		// BOJ 2748
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		long dp[]; //최댓값이 90이기 때문에 int형으로는 계산이 되지 않는다.
		dp=new long[number+1];
		if(number>=3) {
			dp[1]=1;
			dp[2]=1;
			for(int i=3;i<number+1;i++) {
				dp[i]=dp[i-1]+dp[i-2];
			}
			System.out.print(dp[number]);
		}
		else if(number==2||number==1){
			System.out.print(1);
		}
	}
}
