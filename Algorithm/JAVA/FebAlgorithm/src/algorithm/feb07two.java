package algorithm;
import java.util.Scanner;
public class feb07two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int time=s.nextInt();
		s.close();
		int arr[]=new int[] {300,60,10};
		int count[]=new int[3];
		for(int i=0;i<3;i++) {
			count[i]=time/arr[i];
			time%=arr[i];
		}
		if(time!=0) {
			System.out.print(-1);
		}else {
			System.out.print(count[0]+" "+count[1]+" "+count[2]);
		}

	}

}
