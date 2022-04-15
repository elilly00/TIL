package baekjoon.weeks3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 6 - 기찍 N]
메모리 : 32788KB
시간 : 1128ms
코드 길이 : 289B
    ↓ BufferedReader + StringBuilder
메모리 : 23076KB
시간 : 312ms
코드 길이 : 487B
*/
public class Baekjoon_2742 {
    // public static void main(String[] args) {
    //     Scanner sc = mew Scanner(System.in);

    //     int num = sc.nextInt();

    //     for(int i = num; i > 0; i--) {
    //         System.out.println(i);
    //     }
    //     sc.close();
    // }

    // BufferedReader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        for(int i = num; i > 0; i--) {
            sb.append(i+"\n"); 
        }
        System.out.println(sb);
    }
}