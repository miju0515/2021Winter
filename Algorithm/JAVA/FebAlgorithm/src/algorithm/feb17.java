package algorithm;
import java.util.Scanner;
public class feb17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		int count=0;
		while(number>0) {
			if(number%3==0) {
				count+=number/3;
				break;
			}
			number--;
			count++;
		}
		if(count%2==0) {
			System.out.print("CY");
		}
		else {
			System.out.print("SK");
		}

	}

}
