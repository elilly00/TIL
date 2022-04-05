package baekjoon.week2;

import java.util.Scanner;
/*
[백준 알고리즘 - 조건문 단계 3 - 윤년]
메모리 : 17736KB
시간 : 212ms
코드 길이 : 531B  
 */
public class Baekjoon_2753 {
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        sc. close();

        if(year % 4 == 0) {
            if(year % 400 == 0) {
                System.out.println("1");
            } else if(year % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}