## 문제 설명
![ct1](https://user-images.githubusercontent.com/90914001/169482993-979c745a-b77e-4dee-8e71-a96a6dd7a5e2.PNG)

## 코드
```java
class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
        int i;
        
        for(i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}