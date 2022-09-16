package baekjoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
[백준 알고리즘 - 기본 수학2 단계1  - 소수 찾기]
메모리 : 11592KB
시간 : 76ms
코드 길이 : 750B
 */

public class Baekjoon_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        br.readLine();  // 수의 개수 (hasMoreTokens() 메소드를 가지고 있어 변수를 가지고 있지 않아도 됨)

        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(st.hasMoreTokens()) {
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
}