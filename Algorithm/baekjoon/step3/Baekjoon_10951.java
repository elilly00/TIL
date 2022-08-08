package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 반복문 단계 13 - A+B - 4]
메모리 : 17852KB
시간 : 228ms
코드 길이 : 312B
    ↓ BufferedReader + StringBuilder
메모리 : 14204KB
시간 : 124ms
코드 길이 : 688B
 */
public class Baekjoon_10951 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while(sc.hasNextInt()) {
    //         int A = sc.nextInt();
    //         int B = sc.nextInt();
    //         System.out.println(A+B);
    //     }
    //     sc.close();
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while((str=br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
        } 
        System.out.print(sb);
    }
}