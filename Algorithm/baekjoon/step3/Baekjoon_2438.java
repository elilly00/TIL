package baekjoon.step3;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 반복문 단계 9 - 별 찍기 - 1]
메모리 : 17980KB
시간 : 296ms
코드 길이 : 395B
    ↓ BufferedReader + StringBuilder
메모리 : 14132KB
시간 : 128ms
코드 길이 : 583B
 */
public class Baekjoon_2438 {
    // public static void main(string[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int star = sc.nextInt();
    //     sc.close();

    //     for(int i = 1; i <= star; i++) {
    //         for(int j = 1; i <= i; j++) {
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
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}