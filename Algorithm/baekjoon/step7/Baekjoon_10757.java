package baekjoon.step7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;
import java.io.IOException;

/*
[백준 알고리즘 - 기본 수학1 단계 8 - 큰수 A+B]
메모리 : 15056KB
시간 : 192ms
코드 길이 : 601B
 */
public class Baekjoon_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        
        A = A.add(B);
        
        System.out.println(A.toString());
    }
}