package baekjoon.step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
[백준 알고리즘 - 정렬 단계1  - 수 정렬하기]
메모리 : 11860KB
시간 : 84ms
코드 길이 : 660B
 */

public class Baekjoon_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for(int val : arr) {
            sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
}
