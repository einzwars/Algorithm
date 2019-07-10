/* �����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���. */

import java.util.*;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        ArrayList<Integer> supoja = new ArrayList<>(); // ������ �� ���� ���� ������ ���� ��� ���
        int[] score = {0, 0, 0}; // ���� p1, p2, p3 �������� ����
        
        int[] p1 = {1, 2, 3, 4, 5}; // �����ڵ��� ��� ����
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++){    // �ԷµǴ� ��� �����ڵ��� ���� ���ؼ� ���� ����
            if(answers[i] == p1[i%5])
                score[0]++;
            if(answers[i] == p2[i%8])
                score[1]++;
            if(answers[i] == p3[i%10])
                score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2])); // ���� ���� ���� ����� ����
        
        for(int i=0; i<score.length; i++){  // ���� ���� ���� ��� arraylist�� ����. �� ��  ��� ������ ������ 3, 2, 1�� �����.
            if(score[i] == maxScore)
                supoja.add(i+1);
        }
        
        answer = new int[supoja.size()];    // arraylist ũ�⿡ �°� answer �迭 ����
        
        for(int i=0; i<supoja.size(); i++){     // arraylist �о�ͼ� answer�� ����
            answer[i] = supoja.get(i);
        }
        Arrays.sort(answer);    // �迭 ����
        
        return answer;
    }
    public static void main(String[] args) {
		int[] testCase = {1, 2, 3, 4, 5};
		MockTest mt = new MockTest();
		int[] answer = mt.solution(testCase);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println("���ǰ�� ���� ���� ���� ��� : "+answer[i]);
		}
	}
}