package baekjoon.step5;

/*
[백준 알고리즘 - 함수 단계 2 - 셀프 넘버]
메모리 : 11308KB
시간 : 76ms
코드 길이 : 546B
 */
public class Baekjoon_4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];	// 1~10000
 
		for (int i = 1; i < 10001; i++){
			int n = d(i);
		
			if(n < 10001){	// 10000이 넘는 수는 필요X
				check[n] = true;
			}
		}
		StringBuilder sb = new StringBuilder();
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {	// false인 인덱스만 출력함
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static int d(int number){
		int sum = number;
    
		while(number != 0){
			sum = sum + (number % 10); // 첫째 자리수
			number = number/10;	// 10을 나누어 첫째 자리를 없앰
		}    
		return sum;
	}
}