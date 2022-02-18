package algorithm;
import java.util.Scanner;
public class feb18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 19947
		Scanner s=new Scanner(System.in);
		int money=s.nextInt();
		int year=s.nextInt();
		s.close();
		long arr[]=new long[year+1];
		arr[0]=money;
		for(int i=1;i<=year;i++) {
			arr[i]=(int)(arr[i-1]*1.05);
			if(i>=3) {
				arr[i]=(int)(Math.max(arr[i], arr[i-3]*1.20));
			}
			if(i>=5) {
				arr[i]=(int)(Math.max(arr[i], arr[i-5]*1.35));
			}
		}
		System.out.print(arr[year]);
	}

}
