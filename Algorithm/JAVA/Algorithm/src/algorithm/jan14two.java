package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class jan14two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int testNum = s.nextInt();
		for(int i=0;i<testNum;i++) {
			Stack<String> stack =new Stack<>();
			String word=s.next();
			for(int j=0;j<word.length();j++) {
				String now=word.substring(j,j+1);
				if(stack.size()==0) stack.push(now);
				else {
					if(stack.peek().equals("(") && now.equals(")") ) stack.pop();
					else stack.push(now);
				}
				
			}
			if(stack.size()==0) System.out.println("YES");
			else System.out.println("NO");
		}
		s.close();
	}

}
