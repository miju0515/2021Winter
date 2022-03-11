package algorithm;
import java.util.Scanner;
public class mar08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int count=0;
		for(int i=0;i<number;i++) {
			String word=s.next();
			Boolean isWord=true;
			int alphabet[]=new int[26];
			for(int j=0;j<word.length();j++) {
				char nowchar=word.charAt(j);
				if(j==word.length()-1) {
					if(alphabet[nowchar-97]==1) {
						isWord=false;
					}
				}else {
					char nextchar=word.charAt(j+1);
					if(nowchar!=nextchar) {
						if(alphabet[nowchar-97]==1) {
							isWord=false;
						}
						alphabet[nowchar-97]=1;
					}
				}
				
			}
			if(isWord) {
				count++;
			}
			
		}
		System.out.print(count);
		
		

	}

}
