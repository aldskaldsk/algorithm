package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj11403 {
	
	public static int n;
	public static int[][] arr;
    static boolean[] visited;

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int input = sc.nextInt();
				arr[i][j] = input;
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(find(i,j));
			}
			System.out.println();
		}
		
	}
	
	
	public static int find(int start, int end){		
		if(arr[start][end]==1) return 1;
		else {
			for(int i=0; i<n; n++) {
				if(arr[start][i]==1) {
					find(i, end);
				}
			}
			return 0;
		}
	}
	
//	if(arr[start][end]==1)return 1;
//	else {
//		
//		if(arr[start][i]==1) {
//			arr[i][end] == 1
//		}
//			
//	}
	
	
}
