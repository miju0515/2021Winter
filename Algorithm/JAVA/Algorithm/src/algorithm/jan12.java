package algorithm;
import java.util.Scanner;
public class jan12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int caseNum=s.nextInt();
		s.close();
		for(int i=0;i<caseNum;i++) {
			System.out.println(i+1); //#2741
		}
		for(int i=caseNum;i>0;i--) {
			System.out.println(i); //#2742
		}
	}

}
