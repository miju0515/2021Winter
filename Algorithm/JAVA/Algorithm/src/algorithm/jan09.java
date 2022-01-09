package algorithm;
import java.util.Scanner;
import java.util.HashSet;
public class jan09 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			hash.add(s.nextInt()%42);
		}
		s.close();
		System.out.println(hash.size());
	}

}
