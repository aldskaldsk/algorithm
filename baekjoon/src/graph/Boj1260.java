package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Boj1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // ���� ����
        int M = sc.nextInt(); // ���� ����
        int V = sc.nextInt(); // ���� ����

        // �׷��� �ʱ�ȭ
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // ���� �Է¹޾� �׷��� ����
        for (int i = 0; i < M; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from].add(to);
            graph[to].add(from);
        }

        // �׷����� �� ���� ����Ʈ�� �������� ����
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS ����
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        // BFS ����
        visited = new boolean[N + 1];
        
        bfs(V);
    }

    // DFS ���� (���)
    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS ���� (ť ���)
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph[current]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}

