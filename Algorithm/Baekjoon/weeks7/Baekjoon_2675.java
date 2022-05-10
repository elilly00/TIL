package baekjoon.weeks7;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 문자열 단계 4 - 문자열 반복]
메모리 : 12908KB
시간 : 120ms
코드 길이 : 523B
    ↓ BufferedReader
메모리 : 11468KB
시간 : 76ms
코드 길이 : 773B
 */
public class Baekjjon_2675 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(system.in);

    //     int T = sc.nextInt();   // 테스트 케이스 개수
    //     for(int i = 0; i < T; i++) {
    //         int R = sc.nextInt();   // T 반복 횟수
    //         String S = sc.next();   // 문자열(공백은 읽지 않는 next()로 문자열을 입력받는다.)
            
    //         for(int j = 0; j < S.length(); j++) {
    //             for(int k = 0; k < R; k++) {    // R만큼 반복해서 출력
    //                 System.out.print(S.charAt(j));  // R 만큼 반복된 문자열 S의 각 문자 출력
    //             }
    //         }
    //         System.out.println();   // 한 케이스가 끝나면 줄바꿔 출력
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.pareInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");    // br.readLine()은 한 줄 다 읽기 때문에 split/StringTokenizer로 공백을 구분한다.
            int R = Integer.parseInt(str[0]);   // String을 int로 형변환

            for(int j = 0; j < str[1].length(); j++) { 
                for(int k = 0; k < R; k++) {
                    sb.append(str[1].charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}