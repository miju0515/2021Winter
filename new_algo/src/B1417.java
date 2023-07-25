import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        if(N==1){
            System.out.println(0);
            return;
        }

        int[] arr=new int[N-1];
        int vote=Integer.parseInt(bf.readLine());
        for(int i=0;i<N-1;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }

        int max=0;
        int count=0;

        while(true){
            Arrays.sort(arr);
            max=arr[N-2];
            if(vote>max) break;
            arr[N-2]--;
            count++;
            vote++;
        }
        System.out.println(count);

    }
}
