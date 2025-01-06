package dynamicProgramming;

import java.util.Scanner;

public class Boj24416 {
	
//	재귀 함수 카운팅
	static int cntR = 1;
//	동적함수 카운팅
	static int cntD = 0;
	
//	재귀
	public static int fib(int n){
		if(n ==1 || n==2) 
			return 1;
		else {
			cntR++;
			return(fib(n-1)+fib(n-2));
			}
	}
	
//	동적
	public static int fib2(int n) {
		int[] list = new int[n+1];
		list[1]= 1; list[2] = 1;
		for(int i=3; i<=n; i++) {
			list[i] = list[i-1] + list[i-2];
			cntD++;
		}
		return list[n];
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		fib(n);
		fib2(n);
		
		System.out.print(cntR+" ");
		System.out.println(cntD);
	}
}
