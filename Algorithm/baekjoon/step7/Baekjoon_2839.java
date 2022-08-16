package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[백준 알고리즘 - 기본 수학1 단계7  - 설탕 배달]
메모리 : 11504KB
시간 : 76ms
코드 길이 : 664B
 */

public class Baekjoon_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 배달할 설탕

        if(N == 4 || N == 7) {
            System.out.println(-1);
        } else if(N % 5 == 0) {
            System.out.println(N / 5);
        } else if(N % 5 == 1 || N % 5 == 3) {
            System.out.println((N / 5) + 1);
        } else if(N % 5 == 2 || N % 5 == 4) {
            System.out.println((N / 5) + 2);
        }
    }
}
