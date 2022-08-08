package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 반복문 단계 12 - A+B - 5]
메모리 : 17928KB
시간 : 224ms
코드 길이 : 394B
    ↓ BufferedReader + StringBuilder
메모리 : 14108KB
시간 : 124ms
코드 길이 : 739B
 */
public class Baekjoon_10952 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     while(true) {
    //         int A = sc.nextInt();
    //         int B = sc.nextInt();

    //         if(A == 0 && B == 0) {
    //             sc.close();
    //             break;
    //         }
    //         System.out.println(A+B);
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if(A == 0 && B == 0) {
                break;
            }
            sb.append(A+B).append("\n");
        }
        System.out.print(sb);
    }
}