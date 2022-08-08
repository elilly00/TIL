package baekjoon.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 기본 수학1 단계4  - 달팽이는 올라가고 싶다]
메모리 : 11520KB
시간 : 76ms
코드 길이 : 684B
 */
 
public class Baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());    // 올라가는 길이
        int B = Integer.parseInt(st.nextToken());    // 미끄러지는 길이
        int V = Integer.parseInt(st.nextToken());    // 나무 막대기 길이
        
        int day = (V - B) / (A - B);
        
        if((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
    }
}