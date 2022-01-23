package algorithm;
import java.util.Scanner;
public class jan23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String x=s.next();
		String y=s.next();
		StringBuffer sx=new StringBuffer(x);
		StringBuffer sy=new StringBuffer(y);
		String revX=sx.reverse().toString();
		String revY=sy.reverse().toString();
		StringBuffer sr=new StringBuffer(String.valueOf(Integer.parseInt(revX)+Integer.parseInt(revY)));
		String revR=sr.reverse().toString();
		int length=revR.length();
		for(int i=0;i<length;i++) {
			if(revR.substring(0, 1).equals("0")) {
				revR=revR.substring(1);
			}
		}//뒤집었을 때 앞에 0이 오는 경우 잘라줌
		
		System.out.println(revR);

	}

}
