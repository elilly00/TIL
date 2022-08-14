package baekjoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[백준 알고리즘 - 기본 수학1 단계6 - 부녀회장이 될테야]
메모리 : 11336KB
시간 : 80ms
코드 길이 : 841B
 */

public class Baekjoon_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];
        
        for(int i = 0; i <= 14; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for(int i = 1; i <= 14; i++) {
            for(int j = 2; j <= 14; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apt[k][n]);
        }    
    }
}