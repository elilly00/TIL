package baekjoon.step2;

//import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 조건문 단계 1 - 두 수 비교하기]
메모리 : 17696KB
시간 : 204ms
코드 길이 : 445B
    ↓ 삼항연산자 
메모리 : 17656KB
시간 : 216ms
코드 길이 : 315B
     ↓ BufferedReader + StringTokenizer
메모리 : 14232KB
시간 : 128ms
코드 길이 : 553B  
 */

public class Baekjoon_1330 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int A = sc.nextInt();
    //     int B = sc.nextInt();

    //     sc.close(); 

    //     // if-else문 사용
    //     // if(A > B){
    //     //     System.out.println(">");
    //     // } else if(A < B){
    //     //     System.out.println("<")
    //     // } else if(A == B){
    //     //     System.out.println("==");
    //     // }

    //     // 삼항연산자 사용
    //     System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    // }

    // BufferedReader + StringTokenizer 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    }
}