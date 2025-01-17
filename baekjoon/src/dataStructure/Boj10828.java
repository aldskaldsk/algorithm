package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10828 {

	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        
	        int N = Integer.parseInt(br.readLine()); // ����� ��
	        Stack<Integer> stack = new Stack<>();
	        
	        for (int i = 0; i < N; i++) {
	            String command = br.readLine();
	            
	            if (command.startsWith("push")) {
	                // push X ó��
	                int X = Integer.parseInt(command.split(" ")[1]);
	                stack.push(X);
	            } else if (command.equals("pop")) {
	                // pop ó��
	                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
	            } else if (command.equals("size")) {
	                // size ó��
	                sb.append(stack.size()).append("\n");
	            } else if (command.equals("empty")) {
	                // empty ó��
	                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
	            } else if (command.equals("top")) {
	                // top ó��
	                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
	            }
	        }
	        
	        System.out.print(sb);
	    }

}
