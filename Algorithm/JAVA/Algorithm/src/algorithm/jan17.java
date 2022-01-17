package algorithm;

import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class jan17 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		ArrayDeque<Integer> deque=new ArrayDeque<>();
		int number = Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++) {
			String[] keyword=br.readLine().split(" ");
			if(keyword[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(keyword[1]));
			}else if(keyword[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(keyword[1]));
			}else if(keyword[0].equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.pollFirst()).append('\n');
				}
			}else if(keyword[0].equals("pop_back")) {
				if(!deque.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.pollLast()).append('\n');
				}
			}else if(keyword[0].equals("size")) {
				sb.append(deque.size()).append('\n');
			}else if(keyword[0].equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
			}else if(keyword.equals("front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.peekFirst()).append('\n');
				}
			}else if(keyword[0].equals("back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.peekLast()).append('\n');
				}
			}
			
		}
		System.out.println(sb);

	}

}
