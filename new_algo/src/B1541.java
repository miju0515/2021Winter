import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum=Integer.MAX_VALUE;
        StringTokenizer minus=new StringTokenizer(bf.readLine(),"-");

        while(minus.hasMoreTokens()){
            int add=0;

            StringTokenizer plus=new StringTokenizer(minus.nextToken(),"+");

            while(plus.hasMoreTokens()){
                add+=Integer.parseInt(plus.nextToken());
            }

            if(sum==Integer.MAX_VALUE){
                sum=add;
            }else{
                sum-=add;
            }
        }
        System.out.println(sum);
    }
}
