package baekjoon.week2;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 조건문 단계 2 - 시험 성적]
메모리 : 17724KB
시간 : 224ms
코드 길이 : 338B
     ↓ BufferedReader + StringTokenizer
메모리 : 14184KB
시간 : 136ms
코드 길이 : 543B  
 */
public class Baekjoon_9498 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int score = sc.nextInt();

    //     sc.close();

    //     System.out.println((score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F");
    // }

    //BufferedReader + StringTokenizer 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int socre = Integer.parseInt(st.nextToken());

        System.out.println((score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F");
    }
}