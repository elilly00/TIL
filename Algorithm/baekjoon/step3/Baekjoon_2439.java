package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
[백준 알고리즘 - 반복문 단계 10 - 별 찍기 - 2]
메모리 : 18260KB
시간 : 364ms
코드 길이 : 489B
    ↓ BufferedReader + StringBuilder
메모리 : 14208KB
시간 : 128ms
코드 길이 : 678B
    ↓ BufferedReader + BufferedWriter
메모리 : 14144KB
시간 : 124ms
코드 길이 : 670B
 */
public class Baekjoon_2439 {
    // public static void main(String[] argss) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int star = sc.nextInt(); // 별 최대 개수
    //     sc.close();

    //     for(int i = 1; i <= star; i++) { // 1~star까지 출력
    //         for(int j = 1; j <= star - i; j++) { // 공백 출력(전체 행의 개수에서 별의 개수 빼고 출력)
    //             System.out.print(" ");
    //         }
    //         for(int k = 1; k <= i; k++) {    // 별 개수(i만큼 출력)
    //             System.out.print("*");
    //         }
    //         System.out.println();    // 줄바꿈
    //     }
    // }

    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     int star = Integer.parseInt(br.readLine());
    //     StringBuilder sb = new StringBuilder();

    //     for(int i = 1; i <= star; i++) {
    //         for(int j = 1; j <= star - i; j++) {
    //             sb.append(" ");
    //         }
    //         for(int k =1; k <= i; k++) {
    //             sb.append("*");
    //         }
    //         sb.append("\n");
    //     }
    //     System.out.print(sb);
    // }

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int star = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= star - i; j++) {
				bw.write(" ");
			}
			for (int k = 1; k <= i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush(); // 남아있는 모든 데이터 출력
		bw.close();
	}
}