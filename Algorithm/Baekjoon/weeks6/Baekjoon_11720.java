package baekjoon.weeks6;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 문자열 단계 2 - 숫자의 합]
메모리 : 12876KB
시간 : 112ms
코드 길이 : 389B
    ↓ BufferedReader
메모리 : 11512KB
시간 : 80ms
코드 길이 : 506B
 */
public class Baekjoon_11720 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int N = sc.nextInt();   // (첫째 줄)숫자 개수
    //     String num = sc.next(); // (둘째 줄)숫자
    //     sc.close();

    //     int sum = 0;    // 숫자 총합

    //     for(int i = 0; i < N; i++) {    
    //         sum += num.charAt(i)-48; // charAt()은 해당 문자의 아스키코드 값을 반환하기때문에 -48 또는 -'0'을 해줘 입력받은 숫자 값 그대로를 사용할 수 있도록 한다.
    //     }
    //     System.out.print(sum);
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += num.charAt(i)-48;
        }
        System.out.print(sum);
    }   
}