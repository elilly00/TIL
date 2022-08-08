package baekjoon.step4;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 1차원 배열 단계 2 - 최댓값]
메모리 : 12848KB
시간 : 108ms
코드 길이 : 540B
    ↓ BufferedReader
메모리 : 11464KB
시간 : 76ms
코드 길이 : 670B
 */
public class Baekjoon_2562 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int [] input = new int[9]; 
    //     int max = 0; 
    //     int count = 0; 
        
    //     for(int i = 0; i < 9; i++) { 
    //         input[i] = sc.nextInt(); 
    //     } 
        
    //     for(int i = 0; i < 9; i++) { 
    //         if(input[i] > max) { 
    //             max = input[i]; 
    //             count = i+1; 
    //         } 
    //     } 
    //     System.out.println(max + "\n" + count);
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] input = new int[9];
        int max = 0;
        int count = 0;

        for(int i = 0; i < 9; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 9; i++) {
            if(input[i] > max) {
                max = input[i];
                count = i+1;
            }
            System.out.println(max + "\n" + count);
        }
    }
}