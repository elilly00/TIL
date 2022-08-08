package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 5 - N 찍기]
메모리 : 32384KB
시간 : 1088ms
코드 길이 : 290B
    ↓ BufferedReader
메모리 : 30732KB
시간 : 920ms
코드 길이 : 432B
    ↓ BufferedReader + StringBuilder
메모리 : 17940KB
시간 : 220ms
코드 길이 : 516B
*/
public class Baekjoon_2741 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int num = sc.nextInt();
    //     for(int i = 1; i <= num; i++) {
    //         System.out.println(i);
    //     }
    //     sc.close();
    // }

    // BufferedReader 사용
    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int num = Integer.parseInt(br.readLine());
    //     for(int i - 1; i<= num; i++) {
    //         System.out.println(i);
    //     }
    // }

    // BufferedReader + StringBuilder 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++) {
            sb.append(i).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}