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
	        
		  	// �� �� �Է¹޾� �������� �и�
	        String[] numbers = br.readLine().split(" ");
	        
	        int n = Integer.parseInt(numbers[0]); //�ܾ��� ����
	        int m = Integer.parseInt(numbers[1]); //�ܾ��� ���ڼ�
	        
	        // �ܾ� �󵵸� ������ HashMap
	        Map<String, Integer> map = new HashMap<>();
	        

	        for(int i=0; i<n; i++) {
	        	String word = br.readLine();
	        	 if (word.length() >= m) { // ���̰� m �̻��� �ܾ ����
	                  map.put(word, map.getOrDefault(word, 0) + 1);
	             }
	        }
	        
	        // HashMap�� keySet�� ����Ʈ�� ��ȯ
	        ArrayList<String> list = new ArrayList<>(map.keySet());
	        
	        Collections.sort(list, (a, b) -> {
	            int cnt = map.get(b) - map.get(a); // 1. �󵵷� ����
	            if (cnt != 0) return cnt; 
	            
	            if (a.length() != b.length()) // 2. ���̷� ����
	                return b.length() - a.length();
	            
	            return a.compareTo(b); // 3. ���ĺ� ������ ����
	        });

	        
	        // ���
	        StringBuilder sb = new StringBuilder();
	        for (String word : list) {
	            sb.append(word).append("\n");
	        }
	        System.out.print(sb);
	        
	        
	        br.close();
	}
}
