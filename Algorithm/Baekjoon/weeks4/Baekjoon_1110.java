package baekjoon.weeks4;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 14 - 더하기 사이클]
메모리 : 17708KB
시간 : 204ms
코드 길이 : 406B
    ↓ BufferedReader
메모리 : 14228KB
시간 : 120ms
코드 길이 : 654B
 */
public class Baekjoon_1110 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int N = sc.nextInt();
    //     int count = 0;
    //     int result = N;
    //     sc.close();

    //     while(true) {
    //         int left = result / 10;
    //         int right = result % 10;
    //         result = right * 10 + (left + right) % 10; 
    //         count++;
    //         if(N == result) {
    //             break;
    //         }
    //     }
    //     System.out.println(count);
    // }

    // BufferedReader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreadmReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int result = N;

        while(true) {
            int left = result / 10;
            int right = result % 10;
            result = right * 10 + (left + right) % 10;
            count++;
            if(N == result) {
                break;
            }
            System.out.println(count);
        }
    }
}