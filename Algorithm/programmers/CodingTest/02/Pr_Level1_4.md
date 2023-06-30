## 문제 설명
![pr4](https://user-images.githubusercontent.com/90914001/187070187-31d3875b-b069-442b-8111-dc83b4853693.PNG)

## 코드
```java
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}