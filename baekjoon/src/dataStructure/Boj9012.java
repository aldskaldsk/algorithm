package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt(); // �׽�Ʈ ���̽� ����
	        sc.nextLine(); // ���� ���� ó��

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
//	            	���� ��ȣ�� ���ÿ� �߰�
	                stack.push(c);
	            } else if (c == ')') {
	                if (stack.isEmpty()) {
	                    return false; // �ݴ� ��ȣ�� �� ���� ���
	                }
//	                �ݴ� ��ȣ�� ������ ���� �����͸� ���ÿ��� ����
//	                ��ȣ�� ¦�� ���� ��� ��������� ������ ����ְ� ��
	                stack.pop();
	            }
	        }

	        return stack.isEmpty(); // ������ ��� ������ true
	    }

}
