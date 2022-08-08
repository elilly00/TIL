package baekjoon.step4;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 1차원 배열 단계 5 - 평균]
메모리 : 14020KB
시간 : 148ms
코드 길이 : 606B
    ↓ BufferedReader + StringTokenizer
메모리 : 11864KB
시간 : 88ms
코드 길이 : 855B
 */
public class Baekjoon_1546 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();   // 과목 개수
    //     float[] record = new float[N];   // 과목별 점수
    //     float max = 0; // 최대 점수
    //     float avg = 0; // 평균 점수
        
    //     for(int i = 0; i < record.length; i++) {  // 과목 별 점수를 입력 받아 최대 점수 구함
    //         record[i] = sc.nextInt(); 
    //         if(record[i] > max) { 
    //             max = record[i];  
    //         } 
    //     }
    //     for(int j = 0; j < record.length; j++) {  // 평균 조작 부분
    //          avg += (record[j] / max * 100) / N;   
    //     } 
    //          System.out.println(avg); 
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        float[] record = new float[N];
        float max = 0;
        float avg = 0;

        for(int i = 0; i < record.length; i++) {
            record[i] = Integer.parseInt(st.nextToken());
            if(record[i] > max) {
                max = record[i];
            }
        }
        for(int j = 0; j < record.length; j++) {
            avg += (record[j] / max * 100) / N;
        }
        System.out.println(avg);
    }
}