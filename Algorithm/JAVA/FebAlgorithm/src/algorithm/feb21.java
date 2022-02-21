package algorithm;
import java.util.Scanner;
public class feb21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 18228
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int arr[]=new int[number];
		for(int i=0;i<number;i++) {
			arr[i]=s.nextInt();
		}
		int left=1000000000;
		int where=0;
		while(true) {
			if(arr[where]==-1) break;
			if(arr[where]<=left) {
				left=arr[where];
			}
			where++;
		}
		int right=1000000000;
		for(int i=where+1;i<number;i++) {
			if(arr[i]<=right) {
				right=arr[i];
			}
		}
		System.out.print(left+right);

	}

}
