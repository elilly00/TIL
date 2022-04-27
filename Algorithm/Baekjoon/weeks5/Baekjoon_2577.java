package baekjoon.weeks5;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 1차원 배열 단계 3 - 숫자의 개수]
메모리 : 12816KB
시간 : 112ms
코드 길이 : 434B
    ↓ BufferedReader
메모리 : 11424KB
시간 : 72ms
코드 길이 : 598B
 */
public class Baekjoon_2577 {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
		
    //  int A = sc.nextInt();
	// 	int B = sc.nextInt();
	// 	int C = sc.nextInt();
	// 	sc.close();
      
	// 	int[] counts = new int[10];
	// 	int T = A * B * C;
	// 	while (T > 0) {
	// 		counts[T % 10]++;
	// 		T /= 10;
	// 	}
	// 	for (int i = 0; i < counts.length; ++i) {
	// 		System.out.println(counts[i]);
	// 	}
    // }

    public static void mains(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int[] counts = new int[10];
		int T = A * B * C;
		while(T > 0) {
			counts[T % 10]++;
			T /= 10;
		}
		for(int i = 0; i < counts.length; ++i;) {
			sb.append(counts[i] + "\n");
		}
    }
}