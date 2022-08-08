package baekjoon.step6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 문자열 단계 9 - 크로아티아 알파벳]
메모리 : 11452KB
시간 : 76ms
코드 길이 : 1629B
 */

public class Baekjoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte[] byteArr = br.readLine().getBytes();
        int count = 0;

        for (int i = 0; i < byteArr.length; i++) {
            if (byteArr[i] == 'c' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == '=' || byteArr[i + 1] == '-') {
                    i++;
                }
            } else if (byteArr[i] == 'd' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == 'z' && i < byteArr.length - 2) {
                    if (byteArr[i + 2] == '=') {
                        i += 2;
                    }
                } else if (byteArr[i + 1] == '-') {
                    i++;
                }
            } else if (byteArr[i] == 'l' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == 'j') {
                    i++;
                }
            } else if (byteArr[i] == 'n' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == 'j') {
                    i++;
                }
            } else if (byteArr[i] == 's' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == '=') {
                    i++;
                }
            } else if (byteArr[i] == 'z' && i < byteArr.length - 1) {
                if (byteArr[i + 1] == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}