package baekjoon.weeks6;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 함수 단계 3 - 한수]
메모리 : 12848KB
시간 : 108ms
코드 길이 : 676B
    ↓ BufferedReader
메모리 : 11512KB
시간 : 76ms
코드 길이 : 777B
 */
public class Baekjoon_1065 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print(math(sc.nextInt()));     // 함수 math(sc.nextInt()) 결과값 출력
    //     sc.close();
    // }
    // public static int math(int num) {
    //     int cnt = 0;    // 한수 카운팅 함수

    //     if(num < 100) {
    //         return num;
    //     } else {
    //         cnt = 99;
            
    //         for(int i = 100; i <= num; i++) {
    //             int h = i / 100;        // 백의 자릿수
    //             int t = (i / 10) % 10;  // 십의 자릿수
    //             int o = i % 10;         // 일의 자릿수

    //             if((h - t) == (t - o)) {
    //                 cnt++;
    //             }
    //         }
    //     }  
    //     return cnt;
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(math(Integer.parseInt(br.readLine())));
    }
    public static int math(int num) {
        int cnt = 0;

        if(num < 100) {
            return num;
        } else {
            cnt = 99;

            for(int i = 100; i <= num; i++) {
                int h = i / 100; 
                int t = (i / 10) % 10;
                int o = i % 10;

                if((h - t) == (t - o)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}