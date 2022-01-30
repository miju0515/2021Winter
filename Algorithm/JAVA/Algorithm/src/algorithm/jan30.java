package algorithm;
import java.util.Scanner;
public class jan30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 11557
		Scanner s =new Scanner(System.in);
		int test=s.nextInt();
		for(int i=0;i<test;i++) {
			int number=s.nextInt();
			int max=0;
			String name = null;
			for(int j=0;j<number;j++) {
				String sline=s.next(); 
				int L=s.nextInt();
				if(L>=max) {
					name=sline;
					max=L;
				}
			}
			System.out.println(name);
		}

	}

}
