package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Boj20920 {
		
	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
		  	// 한 줄 입력받아 공백으로 분리
	        String[] numbers = br.readLine().split(" ");
	        
	        int n = Integer.parseInt(numbers[0]); //단어의 개수
	        int m = Integer.parseInt(numbers[1]); //단어의 글자수
	        
	        // 단어 빈도를 저장할 HashMap
	        Map<String, Integer> map = new HashMap<>();
	        

	        for(int i=0; i<n; i++) {
	        	String word = br.readLine();
	        	 if (word.length() >= m) { // 길이가 m 이상인 단어만 저장
	                  map.put(word, map.getOrDefault(word, 0) + 1);
	             }
	        }
	        
	        // HashMap의 keySet을 리스트로 변환
	        ArrayList<String> list = new ArrayList<>(map.keySet());
	        
	        Collections.sort(list, (a, b) -> {
	            int cnt = map.get(b) - map.get(a); // 1. 빈도로 정렬
	            if (cnt != 0) return cnt; 
	            
	            if (a.length() != b.length()) // 2. 길이로 정렬
	                return b.length() - a.length();
	            
	            return a.compareTo(b); // 3. 알파벳 순으로 정렬
	        });

	        
	        // 출력
	        StringBuilder sb = new StringBuilder();
	        for (String word : list) {
	            sb.append(word).append("\n");
	        }
	        System.out.print(sb);
	        
	        
	        br.close();
	}
}
