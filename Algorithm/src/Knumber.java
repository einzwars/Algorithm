/*�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.

�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.*/

import java.util.*;

public class Knumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];     // �����ϴ� ����
            int end = commands[i][1];       // ������ ����
            int pick = commands[i][2];      // �� ����
            int[] temp = new int[end-start+1];      	// �ڸ� �迭�� ������ �ӽ� �迭
            
            int index = 0;  				// temp�� ����� �ε���
            for(int j=start-1; j<end; j++){     		//temp�� �迭 �߶�ֱ�
                temp[index++] = array[j];
            }
            Arrays.sort(temp);  			// temp ����
            answer[i] = temp[pick-1];   	// �� ���ڿ��� 1�� ����� �ε��� ������ �´�
            
        }
         
        return answer;
    }
    
    public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Knumber kn = new Knumber();
		int[] answer = kn.solution(array, commands);
		
		System.out.print("�� K��° �� : ");
		for(int i : answer)
			System.out.print(i+" ");
	}
}