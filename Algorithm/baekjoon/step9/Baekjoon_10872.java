package baekjoon.step9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 재귀 단계 1 - 팩토리얼]
메모리 : 11384KB
시간 : 76ms
코드 길이 : 556B
 */

public class Baekjoon_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());    // 입력 값
        int result = factorial(N);                  // 출력 값
        
        System.out.println(result);
    }
    
    public static int factorial(int N) {    

        if(N <= 1) {    // N이 1 또는 0일 때
            return 1;   // 1 리턴
        }
        return N * factorial(N - 1);    //  1 초과 일 때 N * factorial(N - 1) 리턴
    }
}