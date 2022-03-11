package algorithm;
import java.util.Scanner;
public class mar11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=0;i<number;i++) {
			int A=s.nextInt();
			int B=s.nextInt();
			System.out.println((A*B)/Get(A,B));
		}
		

	}
	public static int Get(int A,int B) {
		if(A%B==0) {
			return B;
		}
		return Get(B,A%B);
	}

}
