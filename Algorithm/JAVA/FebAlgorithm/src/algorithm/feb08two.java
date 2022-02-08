package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class feb08two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int Arr[]=new int[N];
		int Brr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=s.nextInt();
		}
		for(int i=0;i<N;i++) {
			Brr[i]=s.nextInt();
		}
		s.close();
		
		Arrays.sort(Arr);
		Arrays.sort(Brr);
		
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=Arr[i]*Brr[N-i-1];
		}
		System.out.print(sum);

	}

}
