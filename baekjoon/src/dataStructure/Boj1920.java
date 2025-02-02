package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

//N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//�Է�
//ù° �ٿ� �ڿ��� N(1 �� N �� 100,000)�� �־�����. 
//���� �ٿ��� N���� ���� A[1], A[2], ��, A[N]�� �־�����. ���� �ٿ��� M(1 �� M �� 100,000)�� �־�����. 
//���� �ٿ��� M���� ������ �־����µ�, �� ������ A�ȿ� �����ϴ��� �˾Ƴ��� �ȴ�. ��� ������ ������ -231 ���� ũ�ų� ���� 231���� �۴�.
//���
//M���� �ٿ� ���� ����Ѵ�. �����ϸ� 1��, �������� ������ 0�� ����Ѵ�.
public class Boj1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		 // ����Ž���� ���� �迭 ���� 
        Arrays.sort(arr);

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
		

        // ���� Ž���� ����Ͽ� ���� �����ϴ��� Ȯ��
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
//	            Ž������� �߾Ӱ����� ũ�ٸ� �߾Ӱ�+1 ���� ������ ��Ž��
	            if (arr[mid] < target) start = mid + 1;
//	            Ž������� �߾Ӱ����� �۴ٸ� ó������ �߾Ӱ�-1���� ��Ž��
	            else end = mid - 1;
	        }

	        return false;
	}

}
