package dataStructure;

import java.util.Scanner;
import java.util.TreeSet;

//김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
//입력
//첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
//이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
//이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
//듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
public class Boj1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); //개행문자제거
		
//		교집합을 구하고 정렬해서 출력하기 위해 TreeSet으로 저장
		TreeSet<String> setN = new TreeSet<String>();
		TreeSet<String> setM = new TreeSet<String>();
		
		for(int i=0; i<n; i++) {
			setN.add(sc.nextLine());
		}
		for(int i=0; i<m; i++) {
			setM.add(sc.nextLine());
		}
		
		setN.retainAll(setM);
		
		System.out.println(setN.size());
		
		for(String result : setN) {
			System.out.println(result);
		}
		
	}
	
}
