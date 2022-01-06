package algorithm;
import java.util.Scanner;
public class jan06 {

	public static void main(String[] args) {
		// BOJ #2577
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int multi=a*b*c; //3개 값 곱함
		String multi1=String.valueOf(multi); //정수를 한 자리씩 나누기 위해서 String으로 바꿈
		String result[]=new String[multi1.length()]; 
		Integer count[]=new Integer[10]; //0~9까지 횟수를 더할 배열 생성
		for(int i=0;i<10;i++) {
			count[i]=0; //전부 0으로 초기화
		}
		for(int i=0;i<multi1.length();i++) {
			result[i]=multi1.substring(i,i+1); //한자리씩 나눔
			for(int j=0;j<10;j++) {
				if(result[i].equals(String.valueOf(j))) { //나눈 값이 어떤 값인지 확인
					count[j]++;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(count[i]);
		}
		
	}

}
