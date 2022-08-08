package baekjoon.step4;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 1차원 배열 단계 6 - OX퀴즈]
메모리 : 13452KB
시간 : 132ms
코드 길이 : 652B
    ↓ BufferedReader + StringBuilder
메모리 : 11744KB
시간 : 80ms
코드 길이 : 874B
 */
public class Baekjoon_8958 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int test = sc.nextInt();    // 테스트 케이스 개수
    //     String arr[] = new String[test];   

    //     for(int i = 0; i < test; i++) {
    //         int count = 0;  // 연속 횟수
    //         int total = 0;  // 누적 합산
    //         arr[i] = sc.next();
    //         for(int j = 0; j < arr[i].length(); j++) {
    //             if(arr[i].charAt(j) == 'O') {
    //                 count++;
    //             } else {
    //                 count = 0;
    //             }
    //             total += count;
    //         }
    //         System.out.pritnln(total);
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test = Integer.parseInt(br.readLine());
        String arr[] = new String[test];

        for(int i = 0; i < test; i++) {
            int count = 0;
            int total = 0;
            arr[i] = br.readLine();
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                total += count;
            }
            sb.append(total + "\n");
        }
        System.out.print(sb);
    }
}
