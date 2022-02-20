package algorithm;
import java.util.Scanner;
public class feb20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt(); //쌓이는 피로도
		int B=s.nextInt(); //일
		int C=s.nextInt(); //줄어드는 피로도
		int M=s.nextInt(); //최대 피로도
		s.close();
		int mental=0;
		int work=0;
		int hour=0;
		while(hour!=24) {
			if(A>M) break;
			if(mental+A<=M) {
				work+=B;
				mental+=A;
				hour++;
			}else {
				if(mental-C>=0) {
					mental-=C;
				}
				else { 
					mental=0;
				}
				hour++;

			}
		}
		System.out.print(work);
	}

}
