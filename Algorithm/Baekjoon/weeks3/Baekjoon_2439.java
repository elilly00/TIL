package baekjoon.weeks3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 10 - 별 찍기 - 2]
메모리 : 18260KB
시간 : 364ms
코드 길이 : 489B
    ↓ BufferedReader + StringBuilder
메모리 : 14208KB
시간 : 128ms
코드 길이 : 678B
 */
public class Baekjoon_2439 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int star = sc.nextInt();
    //     sc.close();

    //     for(int i = 1; i <= star; i++) {
    //         for(int j = 1; j <= star - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for(int k = 1; k <= i; k++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int star = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= star; i++) {
            for(int j = 1; j <= star - i; j++) {
                sb.append(" ");
            }
            for(int k =1; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}