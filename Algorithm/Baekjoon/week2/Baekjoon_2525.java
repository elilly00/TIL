package baekjoon.week2;

import java.util.Scanner;
/*
[백준 알고리즘 - 조건문 단계 6 - 오븐 시계]
메모리 : 18448KB
시간 : 232ms
코드 길이 : 452B
 */
public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   // hour
        int B = sc.nextInt();   // minute
        int C = sc.nextInt();   // 요리 시간

        A += C / 60;
        B += C % 60;

        if (B >= 60) {
            B -= 60;
            A += 1;
        }

        if (A >= 24){
            A -= 24;
        }

        System.out.println(A + " " + B);
    }
}