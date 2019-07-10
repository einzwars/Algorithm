/*124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.

10진법	124 나라	10진법	124 나라
-------------------------------
1		 1		 6		  14
2		 2		 7		  21
3		 4		 8		  22
4		 11		 9		  24
5		 12		 10		  41

자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.
*/

import java.util.*;

class Solution {
  public String solution(int n) {
      String answer = "";
      int remainder;
      
      while(n>0){
            remainder = n%3;	// 나머지
            n = n/3;            // 3진법 이용하기 위해 몫 구함

            if(remainder == 0){
                n -= 1;         // 이렇게 해야 반복횟수 조절 가능
                remainder = 4;
            }
            answer = remainder + answer;
        }
      return answer;
    }
}