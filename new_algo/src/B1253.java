import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count=0;

        long arr[]=new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        for(int i=0;i<N;i++) {
            long num = arr[i];
            int f = 0;
            int b = N - 1;

            while(f<b) {
                if (arr[f] + arr[b] == num) {
                    if (f != i && b != i) {
                        count++;
                        break;
                    } else if (f == i) {
                        f++;
                    } else if (b == i) {
                        b--;
                    }
                } else if (arr[f] + arr[b] < num) {
                    f++;
                } else {
                    b--;
                }
            }
        }

        System.out.println(count);
        bf.close();
    }
}
