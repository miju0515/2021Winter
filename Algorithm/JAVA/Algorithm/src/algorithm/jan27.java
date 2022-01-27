package algorithm;
import java.util.Scanner;
public class jan27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String line=s.nextLine();
		int length=line.length();
		StringBuilder word=new StringBuilder();
		for(int i=0;i<length;i++) {
			
			if(line.substring(i,i+1).equals("a")||line.substring(i,i+1).equals("e")||line.substring(i,i+1).equals("i")||line.substring(i,i+1).equals("o")||line.substring(i,i+1).equals("u")) {
				word.append(line.substring(i,i+1));
				i+=2;
			}else {
				word.append(line.substring(i,i+1));
			}
			
		}
		System.out.print(word);

	}

}
