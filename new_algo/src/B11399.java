import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        int[] time=new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            time[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);
        int answer=0;
        for(int i=0;i<N;i++){
            answer+=time[i]*(N-i);
        }

        System.out.println(answer);
        bf.close();

    }
}
