package baekjoon.week2;

// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 조건문 단계 5 - 알람 시계]
메모리 : 18476KB
시간 : 232ms
코드 길이 : 507B
     ↓ BufferedReader+StringTokenizer
메모리 : 16120KB
시간 : 152ms
코드 길이 : 801B  
풀이 방법 : 입력 받는 분(minute)이 45분 보다 빠르다면 시(hour)에 -1을 해주고 45분 보다 느리다면 입력 받는 minute에 -45분을 해준다.
            또한, hour의 시작은 0시이고 끝은 23시이기 때문에 hour가 0시보다 작으면 23시가 되도록 한다.
 */
public class Baekjoon_2884 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int Hour = sc.nextInt();    // hour
    //     int Min = sc.nextInt();    // minute

    //     sc.close();

    //     if(Min < 45) { 
    //         Hour--;    
    //         Min = 60 - (45 - Min);   // minute는 총 60분이기 때문에 입력값이 45분보다 작으면 45에서 뺀 값을 60에서 뺀다.
    //         if(Hour < 0) {
    //             Hour = 23;
    //         }
    //         System.out.println(Hour + " " + Min);
    //     } else {
    //         System.out.println(Hour + " " + (Min - 45));  
    //     }
    // }

    // BufferedReader+StringTokenizer 사용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int Hour = Integer.parseInt(st.nextToken());
        int Min = Integer.parseInt(st.nextToken());

        if(Min < 45) {
            Hour--;
            Min = 60 - (45 - Min);
            if(Hour < 0) {
                Hour = 23;
            }
            System.out.println(Hour + " " + Min);
        } else {
            System.out.println(Hour + " " + (Min - 45));
        }
    }
}