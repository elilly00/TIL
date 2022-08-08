package baekjoon.step4;

// import java.util.Scanner;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 1차원 배열 단계 4 - 나머지]
메모리 : 12872KB
시간 : 112ms
코드 길이 : 383B
    ↓ BufferedReader
메모리 : 11504KB
시간 : 72ms
코드 길이 : 453B
 */
public class Baekjoon_3052 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     HashSet<Integer> num = new HashSet<Integer>();

    //     for(int i = 0; i < 10; i++) {
    //         num.add(sc.nextInt() % 42);  // 입력받은 값의 나머지 값을 add 메서드를 통해 HashSet에 저장함
    //     }
    //     sc.close();
    //     System.out.println(num.size());  // HashSet의 크기 즉, 저장되어있는 원소의 개수를 출력함.
    // }

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> num = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			num.add(Integer.parseInt(br.readLine()) % 42);
		}
		System.out.print(num.size());
	}
}