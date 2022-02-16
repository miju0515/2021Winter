package algorithm;
import java.util.Scanner;
public class feb16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int cost=s.nextInt();
		s.close();
		int count=0;
		while(cost>0) {
			if(cost%5==0) {
				count+=cost/5;
				break;
			}
			cost-=2;
			count++;
			if(cost<0) {
				count=-1;
				break;
			}
		}
		System.out.print(count);

	}

}
