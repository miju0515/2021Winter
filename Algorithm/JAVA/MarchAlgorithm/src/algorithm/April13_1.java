package algorithm;

import java.util.Scanner;

public class April13_1 {
    public static int N;
    public static int[] sum;
    public static void sum(int[] arr){
        sum=new int[N];
        sum[0]=arr[0];
        for(int i=1;i<N;i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
    }

    public static void Main(String[] Args){
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        int M=s.nextInt();
        int array[]=new int[N];
        for(int i=0;i<N;i++){
            array[i]=s.nextInt();
        }
        sum(array);
        for(int i=0;i<M;i++){
            int start=s.nextInt();
            int finish=s.nextInt();
            System.out.println(sum[finish]-sum[start]);
        }


    }
}