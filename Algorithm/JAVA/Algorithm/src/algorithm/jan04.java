package algorithm;

import java.util.Scanner;
public class jan04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			String test=s.next();
			if(test.equals("0")) break;//0이 입력되면 종료
			int length=test.length();
			int equal=0;//같은지 카운트
			String arr[]=new String[test.length()];
			for(int i=0;i<length;i++) {
				arr[i]=test.substring(i,i+1);//1개씩 잘라서 배열에 저장
			}
			
			for(int i=0;i<length;i++) {
				if(arr[i].equals(arr[length-i-1])) {//같은지 확인
					equal++;
				}
				
			}
			if(equal==length) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		

	}

}
