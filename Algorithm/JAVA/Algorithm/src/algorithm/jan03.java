package algorithm;

import java.util.Scanner;

public class jan03 { 

	public static void main(String[] args) {
		/* Boj 2920
		Scanner s=new Scanner(System.in);//테스트 케이스 개수 받음
		Integer arr[]=new Integer[8];
		int cnt=0;
		boolean isAscending=false;
		boolean isDescending=false;
		boolean isMixed=false;
		for(int i=0;i<8;i++) {
			arr[i]=s.nextInt();
		}
		while(true) {
			if(cnt==7) break;
			if(arr[cnt+1]==(arr[cnt]+1)) {
				isAscending=true;
				cnt++;
			}
			else if(arr[cnt+1]==(arr[cnt]-1)) {
				isDescending=true;
				cnt++;
			}
			else {
				isAscending=false;
				isDescending=false;
				isMixed=true;
				break;
			}
		}
		if(isAscending) System.out.println("ascending");
		else if(isDescending) System.out.println("descending");
		else if(isMixed) System.out.println("mixed");
		*/
		
		int max=-1000000;
		int min=1000000;
		Scanner s=new Scanner(System.in);
		Integer arr[]=new Integer[s.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min+" "+max);

	}

}
