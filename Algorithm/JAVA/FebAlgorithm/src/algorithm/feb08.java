package algorithm;
import java.util.Scanner;
public class feb08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int arr[]=new int[] {25,10,5,1};
		for(int i=0;i<number;i++) {
			int cost=s.nextInt();
			int count[]=new int[4];
			for(int j=0;j<4;j++) {
				count[j]=cost/arr[j];
				cost%=arr[j];
			}
			System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]);
		}

	}

}
