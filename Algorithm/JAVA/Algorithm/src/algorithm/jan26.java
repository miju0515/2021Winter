package algorithm;
import java.util.Scanner;
public class jan26 {

	public static void main(String[] args) {
		//BOJ 5533
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		Integer arr[][]=new Integer[number][3];
		for(int i=0;i<number;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int score[]=new int[number];
		int count=0;
		for(int j=0;j<3;j++) {
			for(int i=0;i<number;i++) {
				count=0;
				for(int k=0;k<number;k++) {
					if(i!=k && arr[i][j]==arr[k][j]) {
						count++;
					}
				}
				if(count==0) score[i]+=arr[i][j];
			}
		}
		for(int i=0;i<number;i++) {
			System.out.println(score[i]);
		}

	}

}
