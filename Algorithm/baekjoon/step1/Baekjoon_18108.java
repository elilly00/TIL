package baekjoon.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 입출력과 사칙연산 단계 11]
메모리 :14228KB
시간 : 128ms
코드 길이 : 466B
 */
public class Baekjoon_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int year = Integer.parseInt(st.nextToken());

        System.out.println(year - 543);
    }
}