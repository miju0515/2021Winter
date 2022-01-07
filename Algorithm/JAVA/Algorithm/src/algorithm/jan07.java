package algorithm;
import java.util.Scanner;
public class jan07 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word1=s.next();
		Integer count[]=new Integer[26];
		for(int i=0;i<26;i++) {
			count[i]=-1;
		}
		String word[]=new String[word1.length()];
		
		for(int i=0;i<word1.length();i++) {
			if(count[word1.charAt(i)-97]==-1) {
				count[word1.charAt(i)-97]=i;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.print(count[i]+" ");
		}

	}

}
