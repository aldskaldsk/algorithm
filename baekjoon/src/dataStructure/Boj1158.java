package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//요세푸스 문제는 다음과 같다.
//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
//이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
//이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
//예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
//N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

public class Boj1158 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N명
        int k = sc.nextInt(); // K번째

        ArrayList<Integer> q = new ArrayList<>();

        // 1번부터 N번까지 추가
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

//      출력할 값을 저장
        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;
        while (!q.isEmpty()) {
            index = (index + k - 1) % q.size(); // K번째 사람 선택
            result.append(q.remove(index)); // 제거

            if (!q.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">\n");
        System.out.print(result);
    }
	

}
