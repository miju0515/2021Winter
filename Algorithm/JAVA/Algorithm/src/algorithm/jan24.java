package algorithm;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class jan24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2161
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=number;i++) {
			queue.add(i);
		}
		StringBuilder sb=new StringBuilder();
		while(queue.size()!=1) {
			sb.append(queue.poll()).append(" ");
			int top=queue.poll();
			queue.add(top);
		}
		sb.append(queue.poll());
		System.out.print(sb);
	}

}
