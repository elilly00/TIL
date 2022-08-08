package baekjoon.step2;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 조건문 단계 4 - 사분면 고르기]
메모리 : 17576KB
시간 : 212ms
코드 길이 : 580B
     ↓ BufferedReader
메모리 : 14148KB
시간 : 120ms
코드 길이 : 712B  
 */
public class Baekjoon_14681 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt();
    //     int y = sc.nextInt();

    //     sc.close();

    //     if(x > 0) {
    //         if(y > 0) {
    //             System.out.println("1");
    //         } else {
    //             System.out.println("4");
    //         }
    //     } else {
    //         if(y > 0) {
    //             System.out.println("2");
    //         } else {
    //             System.out.println("3");
    //         }
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0) {
            if(y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}