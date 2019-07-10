/*������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.*/

import java.util.*;

public class NotFinishPlayer {
    public String solution(String[] participant, String[] completion) {   
        String answer = "";
        sort(participant);
        sort(completion);
      
        for(int i=0; i<participant.length-1; i++){		// �̸��� �ٸ��� answer�� �����ϰ� break
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
        return answer;        
    }
    
     public void sort(String[] array){					// ��ǰ ����
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
		String[] participant = {"leo", "kiki", "eden"};		// ������
		String[] completion = {"eden", "kiki"};				// ������
		
		String answer = nfp.solution(participant, completion);
		System.out.println(answer);
	}
}