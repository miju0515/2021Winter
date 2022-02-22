package algorithm;
import java.util.Scanner;

public class feb22 {
	public static void main(String[] args) {
		//BOJ 1343
		Scanner s=new Scanner(System.in);
		String word=s.next();
		StringBuilder result=new StringBuilder();
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.substring(i,i+1).equals("X")) {
				count++;
			}
			else {
				if(count%2!=0) {
					result=new StringBuilder();
					result.append("-1");
					count=0;
					break;
				}
				while(count>0) {
					if(count>=4) {
						result.append("AAAA");
						count-=4;
					}
					else {
						result.append("BB");
						count-=2;
					}
				}
				result.append(".");
			}
		}
		if(count>0) {
			if(count%2!=0) {
				result=new StringBuilder();
				result.append("-1");
			}else {
				while(count>0) {
					if(count>=4) {
						result.append("AAAA");
						count-=4;
					}
					else {
						result.append("BB");
						count-=2;
					}
				}
			}
			
		}
		System.out.print(result);

	}
}
