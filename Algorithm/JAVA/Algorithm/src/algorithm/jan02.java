package algorithm;

import java.util.Scanner;

public class jan02 {//BOJ 8958번

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//테스트 케이스 개수 받음
		String arr[]=new String[s.nextInt()];//테스트 케이스를 저장할 배열
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.next();//개수만큼 배열에 케이스를 저장함
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;//합
			int sequenceNum=0;//연속개수
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {//만약 해당 문자열이 O이면 연속개수++
					sequenceNum++;
				}
				else {
					sequenceNum=0;//해당 문자열이 X면 연속개수를 0으로 바꾼다.
				}
				sum+=sequenceNum;//연속개수를 더한다.
			}
			System.out.println(sum);
		}
		
	}

}
