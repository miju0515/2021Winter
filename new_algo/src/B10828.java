import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        Stack<Integer> stack= new Stack<Integer>();
        for(int i=0;i<N;i++){
            String word=bf.readLine();
            if(word.split(" ")[0].equals("push")){
                stack.push(Integer.parseInt(word.split(" ")[1]));
            }else if(word.equals("pop")){
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            }else if(word.equals("size")){
                System.out.println(stack.size());
            } else if(word.equals("empty")){
                if(stack.empty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(word.equals("top")){
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }

            }
        }
        bf.close();
    }
}
