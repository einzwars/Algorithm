/*수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.*/

import java.util.*;

public class NotFinishPlayer {
    public String solution(String[] participant, String[] completion) {   
        String answer = "";
        sort(participant);
        sort(completion);
      
        for(int i=0; i<participant.length-1; i++){		// 이름이 다르면 answer에 대입하고 break
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        return answer;        
    }
    
     public void sort(String[] array){					// 거품 정렬
         for(int i=0; i<array.length; i++){
             for(int j=i+1; j<array.length; j++){
                 if((array[i].compareTo(array[j]))<0){
                     String tmp = array[j];
                     array[j] = array[i];
                     array[i] = tmp;
                 }
             }
         }
     }
     public static void main(String[] args) {
		NotFinishPlayer nfp = new NotFinishPlayer();
		String[] participant = {"leo", "kiki", "eden"};		// 참가자
		String[] completion = {"eden", "kiki"};				// 완주자
		
		String answer = nfp.solution(participant, completion);
		System.out.println(answer);
	}
}