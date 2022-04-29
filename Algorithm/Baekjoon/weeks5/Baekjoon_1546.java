package baekjoon.weeks5;

import java.util.Scanner;
/*
[백준 알고리즘 - 1차원 배열 단계 5 - 평균]
메모리 : 14316KB
시간 : 152ms
코드 길이 : 590B
 */
public class Baekjoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();   // 최댓값
        float[] record = new float[M]; 
        float max = 0; 
        float avg = 0; 
        
        for(int i = 0; i < record.length; i++) { 
            record[i] = sc.nextInt(); 
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
}