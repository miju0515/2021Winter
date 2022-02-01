package algorithm;

import java.util.Stack;
import java.util.Scanner;

public class feb01 {
	public static void main(String[] args) {
		/*Stack<Integer> stack=new Stack<>();
		stack.add(1); //스택에 값 넣기
		stack.capacity();
		stack.clear();//스택 비우기
		stack.contains(1);//괄호안의 값이 스택에 들어있는지 확인
		stack.empty();//스택이 비었는지 확인
		*/
		
		Scanner s=new Scanner(System.in);
		Stack<String> sstack=new Stack<>();
		int number=s.nextInt();
		s.nextLine();
		for(int i=0;i<number;i++) {
			String line=s.nextLine();
			String arr[]=line.split(" ");
			int size=arr.length;
			for(int j=0;j<size;j++) {
				sstack.add(arr[j]);
			}
			System.out.print("Case #"+(i+1)+": ");
			for(int j=0;j<size-1;j++) {
				System.out.print(sstack.pop()+" ");
			}
			System.out.println(sstack.pop());
		}
		
		
	}
}
