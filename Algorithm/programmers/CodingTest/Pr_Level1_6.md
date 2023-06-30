## 문제 설명
![pr6](https://user-images.githubusercontent.com/90914001/189138143-fff0b90b-8342-4536-a033-2ba80a7145fd.PNG)

## 코드
```java
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int num = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
                arrList.add(arr[i]);
                num = arr[i];
            }
        }
        
        answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}