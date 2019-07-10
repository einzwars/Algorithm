/* 2부터 N까지의 모든 소수의 합을 구하세요.
N이 7이라면 {2,3,5,7} = 17을 출력 하시면 됩니다.
N의 범위는 2이상 10,000,000이하 입니다.
효율성 테스트의 모든 시간 제한은 1초입니다. */

public class SumOfPrimeNumber {
	
	static boolean primeNumber(int N){		//	소수인지 아닌지 판별하는 함수
	    int half = N/2;
	    for(int i=3; i<=half; i+=2){
	        if(N%i == 0){
	            return false;
	        }
	    }
	    return true;
	}

	static long solution(int N) {
	    long answer = 2;					// N의 범위가 2 이상이기 때문에 2부터 시작
	    
	    for(int i=3; i<=N; i+=2){			// 소수인 수들을 더한다.
	        if(primeNumber(i)){
	            answer += i;
	        }
	    }  
	    return answer;
	}
	
	public static void main(String[] args) {
		int testCase = 7;					// 테스트케이스는 7. 예상 출력값은 17.
		
		System.out.printf("소수의 합 : %d", solution(testCase));	
	}
}
