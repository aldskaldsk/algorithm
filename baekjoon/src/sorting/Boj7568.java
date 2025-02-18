package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Boj7568 {
//	우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 
//	어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시된다. 
//	두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 
//	예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56, 177), (45, 165) 라고 한다면 A의 덩치가 B보다 큰 셈이 된다. 
//	그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다. 예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55, 173)이라면 몸무게는 D가 C보다 더 무겁고, 키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.
//	N명의 집단에서 각 사람의 덩치 등수는 자신보다 더 "큰 덩치"의 사람의 수로 정해진다. 
//	만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다. 
//	이렇게 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능하다. 아래는 5명으로 이루어진 집단에서 각 사람의 덩치와 그 등수가 표시된 표이다.
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		int[][] numbers = new int[n][2];
//		Map<String, Integer> orders = new HashMap<>();
		ArrayList<Integer> orders = new ArrayList<>();
		
		
//		입력 순서대로 저장
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			String[] temp = new String[2];
			temp = input.split(" ");
			numbers[i][0] = Integer.parseInt(temp[0]); //0,0 -> 1,0 ...
			numbers[i][1] = Integer.parseInt(temp[1]); //0,1 -> 1,1 ...
			orders.add(i+1); //기본 지정
			System.out.println(i);
		}
		
//		 orders -> 12345
//		 numbers -> 01234
		for(int j=0; j<n; j++) {
			for(int k=1; k<n; k++) {
//				키와 몸무게 다 작은 경우
				if(numbers[j][0] < numbers[k][0] && numbers[j][1] < numbers[k][1] ) {
					orders.set(j, orders.get(k));
					orders.set(k, orders.get(j));
				}	
//				키만 작은 경우
				if(numbers[j][0] < numbers[k][0] && numbers[j][1] >= numbers[k][1]) {
					orders.set(j, orders.get(k));
				}
//				몸무게만 작은 경우
				if(numbers[j][0] >= numbers[k][0] && numbers[j][1] < numbers[k][1]) {
					orders.set(j, orders.get(k));
				}
//				둘다 큰 경우
				else {
					//유지
				}
			}
		}
		
		for(int result : orders) {
			System.out.println(result);
		}
		
	}
}
