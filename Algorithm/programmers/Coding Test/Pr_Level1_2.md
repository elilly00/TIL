## 문제 설명
![leve1](https://user-images.githubusercontent.com/90914001/172566855-8cbfd50e-c391-4864-9cbb-24592c92bcd0.PNG)

## 코드
```java
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
         HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for(String player : completion) hm.put(player, hm.get(player) -1);
        for(String key : hm.keySet()) {
        	if(hm.get(key) != 0) {
        		answer = key;
        		System.out.println(answer);
        		break;
        	}
        }
        return answer;
    }
}