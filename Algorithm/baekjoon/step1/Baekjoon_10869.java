package baekjoon.step1;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
[백준 알고리즘 - 입출력과 사칙연산 단계 9]
메모리 : 17716KB
시간 : 212ms
코드 길이 : 414B
    ↓
메모리 : 14176KB
시간 : 128ms
코드 길이 : 654B
 */

public class Baekjoon_10869 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int A = sc.nextInt();
    //     int B = sc.nextInt();

    //     System.out.println(A+B);
    //     System.out.println(A-B);
    //     System.out.pritnln(A*B);
    //     System.out.println(A/B);
    //     System.out.println(A%B);

    //     sc.close();
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}