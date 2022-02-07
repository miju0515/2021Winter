package algorithm;
import java.util.Scanner;
public class feb07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int cost=s.nextInt();
		s.close();
		int count=0;
		int payback=1000-cost;
		int arr[]=new int[] {500,100,50,10,5,1};
		for(int i=0;i<6;i++) {
			count+=payback/arr[i];
			payback%=arr[i];
		}
		System.out.print(count);

	}

}
