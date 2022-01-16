package algorithm;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class jan16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number=s.nextInt();
		Queue<Integer> queue=new LinkedList<>();
		Queue<Integer> result=new LinkedList<>();
		for(int i=1;i<=number;i++) {
			queue.add(i);
		}
		int k=s.nextInt();
		while(queue.size()!=0) {
			for(int i=0;i<k-1;i++) {
				int pass=queue.poll();
				queue.add(pass);
			}
			int pop=queue.poll();
			result.add(pop);
		}
		System.out.print("<");
		for(int i=0;i<number-1;i++) {
			System.out.print(result.poll()+", ");
		}
		System.out.print(result.poll()+">");
	}

}
