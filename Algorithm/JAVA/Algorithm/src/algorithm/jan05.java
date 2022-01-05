package algorithm;
import java.util.Scanner;
public class jan05 {

	public static void main(String[] args) {
		Integer house[][]=new Integer[15][15];
		for(int i=0;i<15;i++) {
			house[i][1]=1;
			house[0][i]=i;
		}
		for(int i=1;i<15;i++) {
			for(int j=2;j<15;j++) {
				house[i][j]=house[i-1][j]+house[i][j-1];
			}
		}
		Scanner s=new Scanner(System.in);
		int testCase=s.nextInt();
		for(int i=0;i<testCase;i++) {
			int k=s.nextInt();
			int n=s.nextInt();
			System.out.println(house[k][n]);
		}

	}

}
