package baekjoon.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 기본 수학1 단계 1 - 손익분기점]
메모리 : 11340KB
시간 : 76ms
코드 길이 : 692B
 */
public class Baekjoon_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());    // 고정 비용
        int B = Integer.parseInt(st.nextToken());    // 가변 비용
        int C = Integer.parseInt(st.nextToken());    // 판매 비용
        
        // 순 이익 : C - B
        int result;
        if(B >= C) {
            result = -1;
        } else {
            result = A / (C-B) + 1;
            // 총 비용과 총 수입이 같은 구간(A / (C-B))에 +1이 되면 이득을 보게 됨 
        }
        System.out.println(result);
    }
}