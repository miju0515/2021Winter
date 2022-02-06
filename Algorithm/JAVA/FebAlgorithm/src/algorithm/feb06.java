package algorithm;
import java.util.Scanner;
public class feb06 {
	//BOJ 9625
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		int arr[];
		arr=new int[2];
		arr[0]=1;
		for(int i=0;i<number;i++) {
			int arr0=arr[0];
			arr[0]=arr[1];
			arr[1]+=arr0;
		}
		System.out.print(arr[0]+" "+arr[1]);
				
	}

}
