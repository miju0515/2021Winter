package algorithm;
import java.util.Scanner;
public class mar14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String word=s.next();
		int length=word.length();
		int count[]=new int[2];
		count[word.charAt(0)-48]++;
		for(int i=0;i<length-1;i++) {
			if(word.charAt(i)!=word.charAt(i+1)) {
				count[word.charAt(i+1)-48]++;
			}
		}		
		System.out.print(Math.min(count[0], count[1]));
		

	}

}
