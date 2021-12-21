import java.util.Scanner;
public class dec21{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int num=s.nextInt();
			sum+=num*num;
		}
		int result=sum%10;
		System.out.println(result);
	}
}