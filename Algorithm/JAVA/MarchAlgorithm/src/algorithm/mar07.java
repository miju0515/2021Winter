package algorithm;
import java.util.Scanner;
public class mar07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]=new int[26];
		String word=s.next();
		// 단어에 사용된 알파벳 개수 체크
		for(int i=0;i<word.length();i++) {
			int alphabet=word.charAt(i);
			if(alphabet>=93) {
				arr[alphabet-97]+=1;
			}else {
				arr[alphabet-65]+=1;
			}
		}
		
		// 제일 많이 사용된 알파벳 확인
		int max=0;
		char result=' ';
		for(int i=0;i<26;i++) {
			if(arr[i]>max) {
				max=arr[i];
				result=(char)(i+65);
			}else if(arr[i]==max) {
				//만약 가장 많이 사용된 알파벳이 2개 이상이면 '?' 출력
				result='?';
			}
		}
		
		System.out.print(result);

	}

	

}
