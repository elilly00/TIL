import java.util.Scanner;

// 문자열 출력하기
public class Pr_Level0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        
        // 1 ≤ str의 길이 ≤ 1,000,000
        if(length >= 1 && length <= 1000000) {
            System.out.println(str);
        }

        sc.close();
    }
}