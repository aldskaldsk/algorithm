package dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Boj1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String input  = br.readLine();
		
		int[] numbers = 
		Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//		
////		int[] sums = new int[n];
//		ArrayList<Integer> sums = new ArrayList<>();
//		
//		for(int i=0; i<n; i++) {
//			int sum = numbers[i];
//			sums.add(sum);				
//			for(int j=i+1; j<n; j++) {
//				int max = Collections.max(sums);
//				if(max < sum+numbers[j] && !sums.contains(sum+numbers[j])) {
//					sum += numbers[j];
//					sums.add(sum);
//					}
//				else {
//					sum += numbers[j];
//				}	
//			}
//		}
//		
//		int max = Collections.max(sums);
//		System.out.println(max);
		
		  int maxSum = numbers[0]; // ��ü �ִ밪
	      int currentSum = numbers[0]; // ���� ���� �κ� ������ �ִ밪

	        for (int i = 1; i < n; i++) {
	            // ���� �ε����� ���� ���� ������ ���� ũ�ٸ� ���������� ������Ʈ, �ƴ϶�� ������ ����
	            currentSum = Math.max(currentSum + numbers[i], numbers[i]);
	            
	            // ��ü �ִ밪 ������Ʈ
	            maxSum = Math.max(maxSum, currentSum);
	        }

	        System.out.println(maxSum);
		
	}
}
