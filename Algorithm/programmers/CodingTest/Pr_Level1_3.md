## 문제 설명
![캡처](https://user-images.githubusercontent.com/90914001/185945518-11ef8876-3e59-47a1-ab37-0c47d3c01c03.PNG)

## 코드
```java
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}