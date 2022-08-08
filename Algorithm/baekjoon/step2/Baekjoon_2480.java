package baekjoon.step2;

// import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 조건문 단계 7 - 주사위 세개]
메모리 : 17664KB
시간 : 204ms
코드 길이 : 644B
    ↓ BufferedReader + StringTokenizer
메모리 : 14144KB
시간 : 120ms
코드 길이 : 903B
 */
public class Baekjoon_2480 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int A = sc.nextInt();   // 1번 주사위
    //     int B = sc.nextInt();   // 2번 주사위
    //     int C = sc.nextInt();   // 3번 주사위

    //     int result = 0; // 결과
        
    //     if(A == B && B == C && A == C) {  // 모두 같은 눈이 나올 경우
    //         result = 10000 + A * 1000;
    //     } else if(A == B || A == C) {  // 2개만 같은 눈이 나올 경우
    //         result = 1000 + A * 100;
    //     } else if(B == C) {  // 2개만 같은 눈이 나올 경우
    //         result = 1000 + B * 100;
    //     } else {  // 모두 다른 눈이 나올 경우
    //         result = Math.max(A, Math.max(B, C)) * 100;  // max 메서드를 이용해 두 개의 값을 비교하여 가장 큰 값을 리턴하도록 함. 
    //     }
    //     System.out.println(result);

    //     sc.close();
    // }

    // BufferedReader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int result = 0;

        if(A == B && B == C && A == C) {  // 모두 같은 눈이 나올 경우
            result = 10000 + A * 1000;
        } else if(A == B || A == C) {  // 2개만 같은 눈이 나올 경우
            result = 1000 + A * 100;
        } else if(B == C) {  // 2개만 같은 눈이 나올 경우
            result = 1000 + B * 100;
        } else {  // 모두 다른 눈이 나올 경우
            result = Math.max(A, Math.max(B, C)) * 100;  // max 메서드를 이용해 두 개의 값을 비교하여 가장 큰 값을 리턴하도록 함. 
        }
        System.out.println(result);
    }
}