package algorithm;
import java.util.Scanner;
public class jan18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[] = new int[30];
		for(int i=0;i<28;i++) {
			int number=s.nextInt();
			arr[number-1]=1;
		}
		for(int i=0;i<30;i++) {
			if(arr[i]!=1) {
				System.out.println(i+1);
			}
		}

	}

}
