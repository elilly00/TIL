package baekjoon.weeks4;

import java.util.Arrays;
// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
[백준 알고리즘 - 1차원 배열 단계 1 - 최소,최대]
메모리 : 321256KB
시간 : 2632ms
코드 길이 : 383B
    ↓ BufferedReader
메모리 : 105000KB
시간 : 1400ms
코드 길이 : 735B
 */
public class baekjoon_10818 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int N = sc.nextInt();
    //     int[] arr  = new int[N];

    //     for(int i = 0; i < N; i++) {    // for(int i = 1; i <= N; i++)를 작성하니 런타임 에러가 발생하였다.
    //         arr[i] = sc.nextInt();
    //     }

    //     sc.close();
    //     Arrays.sort(arr);  // 배열 오름차순 정렬
    //     System.out.print(arr[0] + " " + arr[N - 1]);
    // }

    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " "); 

      int indext = 0;
      int[] arr = new int[N];

      while(st.hasMoreTokens()) {
        arr[index] = Integer.parseInt(st.nextToken());
        index++;
      }

      Arrays.sort(arr);
      System.out.print(arr[0] + " " + arr[N - 1]);

    }
}


/* 
[배열이나 리스트 정렬하기] 

java.util.Arrays 클래스의 sort() 메서드를 사용해 따로 정렬 로직을 짜지 않아도 
한번의 메서드 호출로 간편하게 배열이나 리스트 정렬이 가능함

Arrays클래스는 배열의 복사, 항목 정렬, 검색과 같은 조작 기능을 가짐

- 배열의 오름차순 정렬
  Arrays.sort() 메서드의 매개값으로 기본 타입 또는 String 배열을 지정하여 오름차순 정렬함

- 배열의 내림차순 정렬  
  Collections 클래스의 reverseOrder()함수를 사용함
  기본 타입 배열을 래퍼클래스로 만들어 Comparator를 두버째 인자에 넣어야 내림차순으로 정렬이 가능함
*/