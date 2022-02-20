package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class feb19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 1246
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(); //알 갯수
		int M=s.nextInt(); //고객 수
		int arr[]=new int[M];
		for(int i=0;i<M;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		Arrays.sort(arr);
		
		int cost=0;
		int max=0;
		for(int i=0;i<M;i++) {
			int total=0;
			if((M-i)<N) {
				total=arr[i]*(M-i);
			}else {
				total=arr[i]*N;
			}
			if(total>max) {
				max=total;
				cost=arr[i];
			}
		
		}
		System.out.print(cost+" "+max);

	}

}
