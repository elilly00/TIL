package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 반복문 단계 4 - 빠른 A+B]
메모리 : 235640KB
시간 : 852ms
코드 길이 : 789B
*/
public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= T; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");        
        }
        br.close();
        bw.flush();
        bw.close();
    }
}