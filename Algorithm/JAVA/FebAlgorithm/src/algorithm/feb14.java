package algorithm;
import java.util.Scanner;
public class feb14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String number1=s.next();
		String number2=s.next();
		int sum1=Integer.parseInt(number1.replaceAll("6", "5"))+Integer.parseInt(number2.replaceAll("6","5"));
		int sum2=Integer.parseInt(number1.replaceAll("5", "6"))+Integer.parseInt(number2.replaceAll("5","6"));
		System.out.print(sum1+" "+sum2);

	}

}
