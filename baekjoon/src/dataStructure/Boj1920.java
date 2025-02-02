package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

//N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
//입력
//첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
//다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
//다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
//출력
//M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
public class Boj1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 // 이진탐색을 위해 배열 정렬 
        Arrays.sort(arr);

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
		

        // 이진 탐색을 사용하여 값이 존재하는지 확인
        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            if (binarySearch(arr, target)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
	}
	
	public static boolean binarySearch(int[] arr, int target) {
		
		  int start = 0, end = arr.length - 1;

	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (arr[mid] == target) return true;
//	            탐색대상이 중앙값보다 크다면 중앙값+1 부터 끝까지 재탐색
	            if (arr[mid] < target) start = mid + 1;
//	            탐색대상이 중앙값보다 작다면 처음부터 중앙값-1까지 재탐색
	            else end = mid - 1;
	        }

	        return false;
	}

}
