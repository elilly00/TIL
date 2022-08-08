package baekjoon.step6;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 문자열 단계 3 - 알파벳 찾기]
메모리 : 12840KB
시간 : 104ms
코드 길이 : 599B
    ↓ BufferedReader
메모리 : 11508KB
시간 : 80ms
코드 길이 : 726B
 */
public class Baekjoon_10809 {
    // public static void main(String[] args) {
    //     Scanner sc = new Sacnner(System.in);

    //     int[] arr = new int[26];    // // 각 문자의 위치를 가리키는 배열

    //     for(int i = 0; i < arr.length; i++) {
    //         arr[i] = -1;    // 모두 -1로 초기화
    //     }

    //     String S = sc.nextLine();   // 입력 단어

    //     for(int i = 0; i < S.length(); i++) { // arr 원소 값이 -1인 경우 초기화
    //         char ch = S.charAt(i);   
              // 문자형 변수 ch를 선언하고 S.char(0)부터 S.char(S.length()-1)까지 문자열의 문자들을 한 글자씩 저장

    //         if(arr[ch - 'a'] == -1) {    // arr[ch = 'a'] 값이 -1일때 괄호안의 문장 실행
    //             arr[ch - 'a'] = i;
    //         }
    //     }
    //     for(int val : arr) {    // 배열의 값을 한 칸씩 띄워 출력
    //         System.out.print(val + " ");
    //     }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}