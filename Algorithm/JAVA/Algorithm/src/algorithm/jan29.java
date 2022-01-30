package algorithm;
import java.util.Scanner;
public class jan29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 1834 나머지와 몫이 같은 수
		Scanner s=new Scanner(System.in);
		long number=s.nextLong();
		s.close();
		long sum=0;
		for(int i=1;i<number;i++) {
			sum+=i*number+i;
		}
		System.out.print(sum);
	}

}
