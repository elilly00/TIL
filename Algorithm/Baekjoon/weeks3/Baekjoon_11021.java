package baekjoon.weeks3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 7 - A+B - 7]
메모리 : 18672KB
시간 : 268ms
코드 길이 : 372B
    ↓ BufferedReader + StringBuilder
메모리 : 14196KB
시간 : 124ms
코드 길이 : 719B
 */
public class Baekjoon_11021 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int T = sc.nextInt();

    //     for(int i = 1; i <= T; i++) {
    //         int A = sc.nextInt();
    //         int B = sc.nextINt();

    //         System.out.println("Case #" + i + ": " + (A+B));
    //     }
    // }

    // BufferedReader + StringBuilder 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append('\n');    
        }
        System.out.println(sb);
    }
}