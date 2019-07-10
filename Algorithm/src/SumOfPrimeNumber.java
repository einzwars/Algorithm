/* 2���� N������ ��� �Ҽ��� ���� ���ϼ���.
N�� 7�̶�� {2,3,5,7} = 17�� ��� �Ͻø� �˴ϴ�.
N�� ������ 2�̻� 10,000,000���� �Դϴ�.
ȿ���� �׽�Ʈ�� ��� �ð� ������ 1���Դϴ�. */

public class SumOfPrimeNumber {
	
	static boolean primeNumber(int N){		//	�Ҽ����� �ƴ��� �Ǻ��ϴ� �Լ�
	    int half = N/2;
	    for(int i=3; i<=half; i+=2){
	        if(N%i == 0){
	            return false;
	        }
	    }
	    return true;
	}

	static long solution(int N) {
	    long answer = 2;					// N�� ������ 2 �̻��̱� ������ 2���� ����
	    
	    for(int i=3; i<=N; i+=2){			// �Ҽ��� ������ ���Ѵ�.
	        if(primeNumber(i)){
	            answer += i;
	        }
	    }  
	    return answer;
	}
	
	public static void main(String[] args) {
		int testCase = 7;					// �׽�Ʈ���̽��� 7. ���� ��°��� 17.
		
		System.out.printf("�Ҽ��� �� : %d", solution(testCase));	
	}
}
