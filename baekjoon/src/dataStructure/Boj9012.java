package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt(); // 테스트 케이스 개수
	        sc.nextLine(); // 개행 문자 처리

	        for (int t = 0; t < T; t++) {
	            String input = sc.nextLine();
	            System.out.println(isVPS(input) ? "YES" : "NO");
	        }

	        sc.close();
	    }

	    private static boolean isVPS(String str) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : str.toCharArray()) {
	            if (c == '(') {
//	            	여는 괄호는 스택에 추가
	                stack.push(c);
	            } else if (c == ')') {
	                if (stack.isEmpty()) {
	                    return false; // 닫는 괄호가 더 많을 경우
	                }
//	                닫는 괄호가 나오면 기존 데이터를 스택에서 제거
//	                괄호의 짝이 맞을 경우 결과적으로 스택은 비어있게 됨
	                stack.pop();
	            }
	        }

	        return stack.isEmpty(); // 스택이 비어 있으면 true
	    }

}
