import java.util.Scanner;

public class B11659 {
    //S[i] = S[i-1] + A[i]
    //S[j] - S[i-1] i에서 j까지 구간 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S[]=new int[N+1];

        //구간합 만들기
        S[0]=0;
        for(int i=1;i<=N;i++){
            S[i]=S[i-1]+sc.nextInt();
        }

        for(int i=0;i<M;i++){
            int f=sc.nextInt();
            int l=sc.nextInt();
            System.out.println(S[l]-S[f-1]);
        }



    }
}
