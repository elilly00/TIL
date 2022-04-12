package baekjoon.weeks3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 반복문 단계 2 - A+B - 3]
메모리 : 17964KB
시간 : 228ms
코드 길이 : 422B
    ↓ BufferedReader
메모리 : 14220KB
시간 : 124ms
코드 길이 : 575B
 */
public class Baekjoon_10950 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int T = sc.nextInt();

    //     for(int i = 1; i <= T; i++) {
    //         int A = sc.nextInt();
    //         int B = sc.nextInt();
            
    //         int C = 0;
    //         C = A + B;
    //         System.out.println(C);   
    //     }
    //     sc.close();
    // }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
	}
}

/* 
BufferedReader 은 문자열로 받아들이게 되는데 우리가 원하는 건 
한 줄에 정수 2개이니 공백을 기준으로 문자열을 분리해주어야 한다. 
이를 위해 필자는 StringTokenizer 을 사용했다. 
( split() 메소드보다 성능이 더 좋다! )
또한 배열을 따로 생성하여 저장했다가 
다시 출력하는 방식보다는 StringBuilder에 계산한 식을 넣어준 뒤 
나중에 한 번에 출력해주는 방식을 택했다. 
*/