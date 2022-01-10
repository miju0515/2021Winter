package algorithm;
import java.util.Scanner;

public class jan10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		String plus[]=new String[2];
		int count=0;
		int plusNumber=0;
		s.close();
		if(number<=9) {
			plus[0]="0";
			plus[1]=String.valueOf(number);
		}
		else {
			plus[0]=(String.valueOf(number)).substring(0,1);
			plus[1]=(String.valueOf(number)).substring(1,2);
		}
		
		while(true) {
			
			plusNumber=Integer.parseInt(plus[0])+Integer.parseInt(plus[1]);
			plus[0]=plus[1];
			if(plusNumber<=9) {
				plus[1]=String.valueOf(plusNumber);
			}
			else {
				plus[1]=String.valueOf(plusNumber).substring(1,2);
			}
			count++;
			if(number==Integer.parseInt(plus[0]+plus[1])) {
				System.out.print(count);
				break;
			}
		}

	}

}
