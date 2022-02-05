package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class feb02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		int number=s.nextInt();
		for(int i=0;i<number;i++) {
			int poll=s.nextInt();
			if(i==0||stack.peek()>poll) {
				stack.add(poll);
			}else if(stack.peek()<=poll) {
				stack.pop();
				if(stack.size()==0||stack.peek()>poll) {
					stack.add(poll);
				}
			}
		}
		System.out.print(stack.size());
	}

}
