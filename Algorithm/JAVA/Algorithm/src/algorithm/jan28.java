package algorithm;
import java.util.Scanner;
public class jan28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 11050 이항계수
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int up=1;
		int down=1;
		if(K<0||K>N) {
			System.out.print("0");
		}else {
			for(int i=1;i<=N;i++) {
				up*=i;
			}
			for(int i=1;i<=K;i++) {
				down*=i;
			}
			for(int i=1;i<=(N-K);i++) {
				down*=i;
			}
			System.out.print(up/down);
		}

	}

}
