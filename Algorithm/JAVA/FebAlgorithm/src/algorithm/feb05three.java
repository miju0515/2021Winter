package algorithm;
import java.util.Scanner;
import java.util.ArrayList;
public class feb05three {
	// BOJ 15312
	public static ArrayList<Integer> solve(ArrayList<Integer> dp){
		if(dp.size()==2) {
			return dp;
		}
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<dp.size()-1;i++) {
			result.add((dp.get(i)+dp.get(i+1))%10);
		}
		return solve(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String A=s.nextLine();
		String B=s.nextLine();
		
		int[] arr=new int[] {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

		ArrayList<Integer> dp=new ArrayList<Integer>();
		int length=A.length();
		// 위치별 획수 구하기
		for(int i=0;i<length;i++) {
			dp.add(arr[(int)A.charAt(i)-65]);
			dp.add(arr[(int)B.charAt(i)-65]);
		}
		ArrayList<Integer> result=solve(dp);
		System.out.print(result.get(0));
		System.out.print(result.get(1));
		
	}

}
