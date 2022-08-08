package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 반복문 단계 8 - A+B - 8]
메모리 : 18952KB
시간 : 276ms
코드 길이 : 383B
    ↓ BufferedReader + StringBuilder
메모리 : 14188KB
시간 : 124ms
코드 길이 : 859B
 */
public class Baekjoon_11022 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int T = sc.nextInt();

    //     for(int i = 1; i <= T; i++) {
    //         int A = sc.nextInt();
    //         int B = sc.nextInt();
    //         System.out.println("Case #" + i + ": " + A + " + " B + " = " + (A+B));
    //     }
    // }

    // BufferedReader + StringBuilder 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ")
            .append(A).append(" + ").append(B).append(" = ").append((A+B)).append("\n");
        }
        System.out.println(sb);
    }
}