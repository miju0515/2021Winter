package algorithm;
import java.util.Scanner;
public class jan20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*while(s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println(line);
		}*/
		int n = s.nextInt();
		int m = s.nextInt();
		int arr[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int k =s.nextInt();
		for(int h=0;h<k;h++) {
			int i=s.nextInt();
			int j=s.nextInt();
			int x=s.nextInt();
			int y=s.nextInt();
			int sum=0;
			for(int a=i;a<=x;a++) {
				for(int b=j;b<=y;b++) {
					sum+=arr[a][b];
				}
			}
			System.out.println(sum);
		}
		s.close();
	}

}
