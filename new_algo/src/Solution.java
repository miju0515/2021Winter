import java.sql.SQLOutput;
import java.util.Stack;

class Solution {
    /*
    public static String[] solution(int maxSize, String[] actions) {
        String[] answer = {};

        Stack<String> visited=new Stack<String>();
        Stack<String> back=new Stack<String>();
        Stack<String> front=new Stack<String>();

        for(int i=0;i<actions.length;i++){
            if(actions[i].equals("B")){
                if(!back.empty()){
                    front.push(visited.peek());
                    visited.push(back.peek());
                    back.pop();
                }
            }else if(actions[i].equals("F")){
                if(!front.empty()){
                    back.push(visited.peek());
                    visited.push(front.peek());
                    front.pop();
                }
            }else{
                visited.push(actions[i]);
            }
        }

        for(int i=0;i<maxSize;i++){
            answer[i]=visited.peek();
            visited.pop();
        }

        return answer;
    }*/

    public static void main(String[] args) {
        /* int maxSize=3;
        String[] actions={"1","2","3","4","3"};

        String[] answer = {};
        int[] check=new int[100001];

        Stack<String> visited=new Stack<String>();
        Stack<String> back=new Stack<String>();
        Stack<String> front=new Stack<String>();

        for(int i=0;i<actions.length;i++){
            if(actions[i].equals("B")){
                if(!back.isEmpty() && !visited.isEmpty()){
                    front.push(visited.peek());
                    visited.push(back.peek());
                    back.pop();
                }
            }else if(actions[i].equals("F")){
                if(!front.isEmpty() && !visited.isEmpty()){
                    back.push(visited.peek());
                    visited.push(front.peek());
                    front.pop();
                }
            }else{
                if(!visited.isEmpty()) {
                    back.push(visited.peek());
                }
                front.clear();
                visited.push(actions[i]);

            }
        }

        String[] check_answer=new String[visited.size()];
        int size=0;
        int now_size=visited.size();

        for(int i=0;i<now_size;i++){
            System.out.println("now peek"+visited.peek());
            if(visited.isEmpty() || visited.peek()==null){
                System.out.println("break");
                break;
            }else if(!visited.isEmpty() && check[Integer.valueOf(visited.peek())]==0){
                check[Integer.valueOf(visited.peek())]++;
                check_answer[size]=visited.peek();
                System.out.println(visited.peek());
                size++;
                visited.pop();
            }else if(!visited.isEmpty() && check[Integer.valueOf(visited.peek())]!=0){
                System.out.println("just pop");
                visited.pop();
            }
        }

        System.out.println("size="+size);
        if(size>maxSize){
            answer=new String[maxSize];
        }else{
            answer=new String[size];
        }

        for(int i=0;i<answer.length;i++){
            answer[i]=check_answer[i];
        }

*/

        int[] schedules={60,15,60,90,45};
        int answer = 0;
        int recent=0;

        for(int i=0;i<schedules.length;i++){
            if(i==recent+1){ //앞에 꺼를 포함 경우 충전을 위해 비움
                continue;
            }

            if(i==schedules.length-1){ //마지막 스케쥴일 경우 포함
                answer+=schedules[i];
                System.out.println("push "+schedules[i]);
            }else if(i==schedules.length-2){ // 마지막에 2개 남은 경우 더 높은거 포함
                if(schedules[i]>schedules[i+1]){
                    answer+=schedules[i];
                    System.out.println("push "+i+" "+schedules[i]);
                    break;
                }else{
                    answer+=schedules[i+1];
                    System.out.println("push "+i+" "+schedules[i+1]);
                    break;
                }
            }else{
                if(schedules[i]+schedules[i+2]>=schedules[i+1]){
                    answer+=schedules[i];
                    System.out.println("push "+i+" "+schedules[i]);
                    recent=i;
                }else{
                    answer+=schedules[i+1];
                    System.out.println("push "+i+" "+schedules[i+1]);
                    recent=i+1;
                }
            }

        }

    }
}