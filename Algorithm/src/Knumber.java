/*배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.*/

import java.util.*;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];     // 시작하는 시점
            int end = commands[i][1];       // 끝나는 시점
            int pick = commands[i][2];      // 고른 숫자
            int[] temp = new int[end-start+1];      	// 자른 배열을 저장할 임시 배열
            
            int index = 0;  				// temp에 사용할 인덱스
            for(int j=start-1; j<end; j++){     		//temp에 배열 잘라넣기
                temp[index++] = array[j];
            }
            Arrays.sort(temp);  			// temp 정렬
            answer[i] = temp[pick-1];   	// 고른 숫자에서 1을 빼줘야 인덱스 범위가 맞다
            
        }
         
        return answer;
    }
    
    public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Knumber kn = new Knumber();
		int[] answer = kn.solution(array, commands);
		
		System.out.print("각 K번째 수 : ");
		for(int i : answer)
			System.out.print(i+" ");
	}
}