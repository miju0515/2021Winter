package algorithm;
import java.util.Scanner;
public class jan21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.next();
		s.close();
		int size=word.length();
		String arr[]=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=word.substring(i,i+1);
		}
		int count=0;
		for(int i=0;i<size;i++) {
			if(arr[i].equals(arr[size-i-1])) {
				count++;
			}
		}
		if(count==size) { 
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}

	}

}
