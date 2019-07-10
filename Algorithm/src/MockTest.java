/* 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요. */

import java.util.*;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        ArrayList<Integer> supoja = new ArrayList<>(); // 수포자 중 가장 많은 문제를 맞힌 사람 명단
        int[] score = {0, 0, 0}; // 각각 p1, p2, p3 수포자의 점수
        
        int[] p1 = {1, 2, 3, 4, 5}; // 수포자들의 찍기 패턴
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; i++){    // 입력되는 답과 수포자들의 패턴 비교해서 점수 저장
            if(answers[i] == p1[i%5])
                score[0]++;
            if(answers[i] == p2[i%8])
                score[1]++;
            if(answers[i] == p3[i%10])
                score[2]++;
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2])); // 제일 많이 맞은 사람의 점수
        
        for(int i=0; i<score.length; i++){  // 제일 많이 맞은 사람 arraylist에 저장. 이 때  모두 점수가 같으면 3, 2, 1로 저장됨.
            if(score[i] == maxScore)
                supoja.add(i+1);
        }
        
        answer = new int[supoja.size()];    // arraylist 크기에 맞게 answer 배열 설정
        
        for(int i=0; i<supoja.size(); i++){     // arraylist 읽어와서 answer에 저장
            answer[i] = supoja.get(i);
        }
        Arrays.sort(answer);    // 배열 정렬
        
        return answer;
    }
    public static void main(String[] args) {
		int[] testCase = {1, 2, 3, 4, 5};
		MockTest mt = new MockTest();
		int[] answer = mt.solution(testCase);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println("모의고사 가장 많이 맞춘 사람 : "+answer[i]);
		}
	}
}