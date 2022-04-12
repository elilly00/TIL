package baekjoon.weeks3;

import java.util.Scanner;
/*
[백준 알고리즘 - 반복문 단계 3 - 합]
메모리 : 17652KB
시간 : 216ms
코드 길이 : 279B  
 */
public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        sc.close();
    }
}