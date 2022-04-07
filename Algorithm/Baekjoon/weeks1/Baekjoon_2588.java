package baekjoon.weeks1;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
[백준 알고리즘 - 입출력과 사칙연산 단계 13]
메모리 : 17712KB
시간 : 208ms
코드 길이 : 392B
    ↓
메모리 : 14088KB
시간 : 124ms
코드 길이 : 490B   
 */
public class Baekjoon_2588 {
    // public static void main(Stringp[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int A = sc.nextInt();
    //     int B = sc.nextInt();

    //     sc.close();

    //     System.out.println(A*(B%10));
    //     System.out.println(A*(B%100/10));
    //     System.out.println(A*(B/100));
    //     System.out.println(A*B);
    // }

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
	}
}