package algorithm;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class jan31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BOJ 2750번
		Scanner s =new Scanner(System.in);
		TreeSet<Integer> thash=new TreeSet<Integer>();
		int number=s.nextInt();
		for(int i=0;i<number;i++) {
			thash.add(s.nextInt());
		}
		s.close();
		Iterator iter=thash.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
