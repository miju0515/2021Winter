import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int M=Integer.parseInt(bf.readLine());

        int[] arr=new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count=0;
        int f=0;
        int b=N-1;

        while(f<b){
            if(arr[f]+arr[b]<M){
                f++;
            }else if(arr[f]+arr[b]>M){
                b--;
            }else{
                count++;
                f++;
                b--;
            }
        }

        System.out.println(count);
        bf.close();

    }
}
