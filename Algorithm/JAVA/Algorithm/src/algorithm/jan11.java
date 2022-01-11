package algorithm;
import java.util.Scanner;
public class jan11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int caseNum=s.nextInt(); //테스트 케이스 개수
		for(int i=0;i<caseNum;i++) {
			double sum=0; //점수의 합
			double avg=0; //평균
			double count=0; //평균을 넘는 학생의 수
			int testCase=s.nextInt(); //학생 수
			int arr[]=new int[testCase];
			for(int j=0;j<testCase;j++) {
				arr[j]=s.nextInt();
				sum+=arr[j]; //성적 누적
			}
			avg=(sum/testCase); 
			for(int j=0;j<testCase;j++) {
				if(arr[j]>avg) count++; //평균을 넘는 학생의 수
			}
			System.out.printf("%.3f%%\n", (count/testCase)*100);
		}
		s.close();
	}

}
