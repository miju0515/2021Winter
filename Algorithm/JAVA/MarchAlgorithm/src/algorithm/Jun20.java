package algorithm;


import java.util.Scanner;

public class Jun20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A_number=sc.nextInt();
        int B_number=sc.nextInt();
        int[] num_arr=new int[16];
        for(int i=15;i>=0;i-=2){
            num_arr[i]=B_number%10;
            num_arr[i-1]=A_number%10;
            B_number%=10;
            A_number%=10;
        }
        for(int stage=0;stage<14;stage++){
            for(int j=0;j<15-stage;j++){
                num_arr[j]=(num_arr[j]+num_arr[j+1])%10;
            }
        }
        System.out.println(num_arr[0]+num_arr[1]);
    }
}
