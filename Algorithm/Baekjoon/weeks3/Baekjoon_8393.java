package baekjoon.weeks3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 3 - 합]
메모리 : 17692KB
시간 : 200ms
코드 길이 : 316B 
    ↓ BufferedReader
메모리 : 14180KB
시간 : 124ms
코드 길이 : 458B 
 */
public class Baekjoon_8393 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     sc.close();

    //     int sum = 0;

    //     for (int i = 1; i <= n; i++) {
    //         sum += i;
    //     }
    //     System.out.println(sum);
    // }

    // BufferedRreader 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
