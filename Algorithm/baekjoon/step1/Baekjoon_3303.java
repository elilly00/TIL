package baekjoon.step1;

import java.io.IOException;
import java.util.Scanner;
/*
[백준 알고리즘 - 입출력과 사칙연산 단계 10]
메모리 : 12924KB
시간 : 108ms
코드 길이 : 498B 
 */
public class Baekjoon_3303 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[6];
        int[] piece = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < cnt.length; i++) {
            cnt[i] = sc.nextInt();
        }

        for(int i = 0; i < cnt.length; i++) {
            System.out.print(piece[i] - cnt[i] + " ");
        }

        sc.close();
    }
}
