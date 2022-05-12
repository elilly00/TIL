package baekjoon.weeks7;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 문자열 단계 6 - 단어의 개수]
메모리 : 28872KB
시간 : 328ms
코드 길이 : 363B
    ↓ BufferedReader + StringTokenizer
메모리 : 20564KB
시간 : 188ms
코드 길이 : 435B
 */
public class Baekjoon_1152 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     String S = sc.nextLine();   // 문자열 입력 받음
    //     sc.close();

    //     StringTokenizer st = new StringTokenizer(S, " ");   // 공백을 기준으로 나눈 토큰 저장

    //     System.out.println(st.countTokens());   // countTokens()는 토큰의 개수를 반환 함
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamREader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());
    }
}