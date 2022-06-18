package baekjoon.weeks8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
[백준 알고리즘 - 기본 수학1 단계3  - 분수찾기]
메모리 : 11524KB
시간 : 76ms
코드 길이 : 770B
 */

public class Baekjoon_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int X = Integer.parseInt(br.readLine());    // 입력 값
		int cross_count = 1;     // 대각선 칸 개수
        int prev_count_sum = 0;  // 누적 칸의 합
 
		while (true) {
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) { 
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} else {
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}