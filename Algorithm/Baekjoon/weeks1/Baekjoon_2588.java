package baekjoon.week1;

import java.util.Scanner;

/*
[백준 알고리즘 - 입출력과 사칙연산 단계 13 - 곱셈]
메모리 : 17712KB
시간 : 208ms
코드 길이 : 392B
 */
public class Baekjoon_2588 {
    public static void main(Stringp[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}