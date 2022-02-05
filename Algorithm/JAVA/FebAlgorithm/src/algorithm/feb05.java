package algorithm;
import java.util.Scanner;
public class feb05 {
	//BOJ 2747 피보나치수
	public static int arr[];
	
	//피보나치 함수를 재귀함수로 구현한다.
	public static int fibo(int num) {
		// 종료조건(1 혹은 2일 때 1 반환)
		if(num==1||num==2) {
			return 1;
		}
		// 한 번 계산한 적 있으면 그 값 반환
		else if(arr[num]!=0) {
			return arr[num];
		}
		// 계산한 적 없으면 점화식에 따라 계산
		else {
			arr[num]=fibo(num-1)+fibo(num-2);
			return arr[num];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		arr=new int[number+1];
		System.out.print(fibo(number));

	}
	

}
