package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class mar10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char arr[]=s.next().toCharArray();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}

	}

}
