package baekjoon.step5;

/*
[백준 알고리즘 - 함수 단계 1 - 정수 N개의 합]
메모리 : 422660KB
시간 : 32ms
코드 길이 : 170B
 */
 public class Baekjoon_15596 {    
    long sum(int[] a) {
        long ans=0;   // a배열의 정수 합 변수
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}