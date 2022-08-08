package baekjoon.step6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
[백준 알고리즘 - 문자열 단계 10 - 그룹 단어 체커]
메모리 : 11588KB
시간 : 80ms
코드 길이 : 1567B
 */
public class Baekjoon_1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int word = Integer.parseInt(br.readLine());  // 입력 단어 개수 
        int count = 0; // 그룹 단어 개수

        for(int i = 0; i < word; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {  // 그룹 단어 체크
        boolean[] check = new boolean[26];  // 알파벳
        int prev = 0;  // 연속된 문자인지 아닌지 판별
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i 번째(현재) 문자 저장
			
			// 앞선 문자와 i 번째 문자가 같지 않다면
			if(prev != now) {		
				
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if(check[now - 'a'] == false ) {
				    check[now - 'a'] = true;  // true 로 바꿔줌
					prev = now;				  // 다음 턴을 위해 prev도 바꿔줌 
				}
	 
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else {
					return false;  // 함수 종료
				}
			}
	        
			// 앞선 문자와 i 번째 문자가 연속된 문자라면 else 문은 없어도 됨
			else {
				continue;
			}
		}    
		return true;
	}
}