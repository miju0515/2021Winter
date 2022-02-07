package algorithm;
import java.util.Scanner;
public class feb07three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int  N=s.nextInt();
		int cost=s.nextInt();
		int arr[]=new int[N];
		int count=0;
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=N-1;i>=0;i--) {
			count+=cost/arr[i];
			cost%=arr[i];
		}
		System.out.print(count);
	}
}
