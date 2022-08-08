package baekjoon.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
[백준 알고리즘 - 기본 수학1 단계 8 - 큰수 A+B]
메모리 : KB
시간 : ms
코드 길이 : B
 */
public class Baekjoon_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A+B);
    }
}