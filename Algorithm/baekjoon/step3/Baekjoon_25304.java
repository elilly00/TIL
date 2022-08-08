package baekjoon.step3;

import java.util.Scanner;
/*
[백준 알고리즘 - 반복문 단계 4 - 영수증]
메모리 : 13068KB
시간 : 132ms
코드 길이 : 547B
*/
public class Baekjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            
            total = total - (price * num);
        }

        if(total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
