package algorithm;
import java.util.Scanner;
public class jan22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String arr[][]=new String[5][15];
		
		//배열에 넣기
		for(int i=0;i<5;i++) {
			String word=s.next();
			int length=word.length();
			for(int j=0;j<15;j++) {
				if(j<length) {
					arr[i][j]=word.substring(j,j+1);
				}
				else {
					arr[i][j]="!";
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<15;i++) {
			for(int j=0;j<5;j++) {
				if(!arr[j][i].equals("!")) {
					sb.append(arr[j][i]);
				}
			}
		}
		System.out.print(sb);

	}

}
