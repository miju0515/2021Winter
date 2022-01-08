package algorithm;
import java.util.Scanner;
public class jan08 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		String arra[]=new String[3];
		String arrb[]=new String[3];
		for(int i=0;i<3;i++) {
			arra[i]=a.substring(i,i+1);
			arrb[i]=b.substring(i,i+1);
		}
		
		int intA=Integer.parseInt(arra[2]+arra[1]+arra[0]);
		int intB=Integer.parseInt(arrb[2]+arrb[1]+arrb[0]);
		
		if(intA>intB) System.out.println(intA);
		else System.out.println(intB);
		
	}

}
