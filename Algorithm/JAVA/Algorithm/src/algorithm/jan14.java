package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class jan14 {

	public static void main(String[] args){
		// BOJ 9093
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int testNum = s.nextInt();
		s.nextLine();
		for(int i=0;i<testNum;i++) {
			Stack stack = new Stack<>();
			String word=s.nextLine()+" ";
			/*String[] split = word.split("\\s+");
			for(int k=0;k<split.length;k++) {
				for(int j=0;j<split[k].length();j++) {
					stack.push(split[k].substring(j,j+1));
				}
				int size=stack.size();
				for(int j=0;j<size;j++) {
					System.out.print(stack.peek());
					stack.pop();
				}
				stack.clear();
				System.out.print(" ");*/
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j)==' ') {
					while(!stack.empty()) {
						System.out.print(stack.pop());
					}
					System.out.print(" ");
				}
				else {
					stack.push(word.charAt(j));
				}
			}
			System.out.println();
		}
		s.close();
	}

}
