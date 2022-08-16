package baekjoon.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 입출력과 사칙연산 단계 8]
메모리 : 14280KB
시간 : 128ms
코드 길이 : 513B
 */
public class Baekjoon_1008 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);
    }
}