## 문제 설명
![Pr5](https://user-images.githubusercontent.com/90914001/187660846-5a927e2e-5011-428e-bd4f-b5e32f9cdfd3.PNG)

## 코드
```java
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = null;
        answer = arr1;

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }
}