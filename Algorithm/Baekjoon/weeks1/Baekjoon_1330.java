package baekjoon.week1;

import java.util.Scanner;
/*
[백준 알고리즘 - 조건문 단계 1 - 두 수 비교하기]
메모리 : 17588KB
시간 : 224ms
코드 길이 : 407B
 */

public class Baekjoon_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A > B){
            System.out.println(">");
        } else if(A < B){
            System.out.println("<")
        } else if(A == B){
            System.out.println("==");
        }
    }
}