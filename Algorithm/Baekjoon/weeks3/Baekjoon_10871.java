package baekjoon.weeks3;

import java.util.Scanner;
/*
[백준 알고리즘 - 반복문 단계 11 - X보다 작은 수]
메모리 : 29584KB
시간 : 396ms
코드 길이 : 471B
    ↓ BufferedReader + StringBuilder
메모리 : 15292KB
시간 : 164ms
코드 길이 : 802B
 */
public class Baekjoon_10871 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int N = sc.nextInt();
    //     int X = sc.nextInt();

    //     StringBuilder sb = new StringBuilder();
    
    //     for(int i = 1; i <= N; i++) {
    //         int A = sc.nextInt();
    //         if(A < X) {
    //             sb.append(A).append(" ");  
    //         }
    //     }
    //     System.out.print(sb);
    // }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 1; i <= N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if(A < X) {
                sb.append(A).append(" ");
            }
        }
        System.out.print(sb);
    }
}