package algorithm;
import java.util.Scanner;
public class jan25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 9933
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		String arr[]=new String[number];
		for(int i=0;i<number;i++) {
			arr[i]=s.next();
		}
		int i=0;
		while(i<number) {
			
			StringBuffer pass=new StringBuffer(arr[i]);
			for(int j=0;j<number;j++) {
				StringBuffer word=new StringBuffer(arr[j]);
				if(pass.toString().equals(word.reverse().toString())) {
					String password=pass.toString();
					int middle=password.length()/2;
					System.out.print(password.length()+" "+password.substring(middle,middle+1));
					i=number;
				}
			}
			i++;
		}

	}

}
