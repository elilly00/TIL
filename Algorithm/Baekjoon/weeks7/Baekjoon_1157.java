package baekjoon.weeks7;

import java.util.Scanner;
/*
[백준 알고리즘 - 문자열 단계 5 - 단어 공부]
메모리 : 28040KB
시간 : 332ms
코드 길이 : 695B
 */
public class Baekjoon_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next().toUpperCase();
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}