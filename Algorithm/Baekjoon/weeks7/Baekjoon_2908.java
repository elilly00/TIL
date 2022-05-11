package baekjoon.weeks7;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 문자열 단계 7 - 상수]
메모리 : 12800KB
시간 : 108ms
코드 길이 : 350B
    ↓ BufferedReader + StringTokenizer
메모리 : 11484KB
시간 : 72ms
코드 길이 : 657B
 */
public class Baekjoon_2908 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
		
	// 	int a = sc.nextInt();   // 상수1
	// 	int b = sc.nextInt();   // 상수2
	// 	sc.close();
        
	// 	a = (a%10) * 100 + ((a%100) / 10) * 10 + (a/100);
	// 	b = (b%10) * 100 + ((b%100) / 10) * 10 + (b/100);
		
	// 	System.out.println(a > b ? a : b);
	// }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a = (a%10) * 100 + ((a%100) / 10) * 10 + (a/100);
        b = (b%10) * 100 + ((b%100) / 10) * 10 + (b/100);

        System.out.println(a > b ? a : b);
    }
}