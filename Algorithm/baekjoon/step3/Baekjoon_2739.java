package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 1 - 구구단]
메모리 : 18536KB
시간 : 268ms
코드 길이 : 272B
    ↓ BufferedReader
메모리 : 16252KB
시간 : 160ms
코드 길이 : 438B
 */
public class Baekjoon_2739 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int N = sc.nextInt();

    //     for(int i = 1; i<10; i++) {
    //         System.out.println(N+" * "+i+" = "+(N*i));
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++) {
            System.out.println(N+" * "+i+" = "+(N*i));
        }
    }
}