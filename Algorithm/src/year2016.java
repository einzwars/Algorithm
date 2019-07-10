/*2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? �� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
 ������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
 ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.

2016���� �����Դϴ�.
2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)*/

import java.util.*;

public class year2016 {
  public String solution(int a, int b) {
      String answer = "";
      int day;
      int month = a;
      int cnt = 0;
      int beforeday = 366;
      String[] dayoftheweek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      
      while(month<=12){
        if(month == 4 || month ==6 || month == 9 || month == 11)
            day = 30;
        else if(month == 2)
            day = 29;
        else
            day = 31;
        beforeday -= day;
        month++;
      }
         
      beforeday += b;
      // System.out.println(beforeday);
      
      for(int i=0; i<dayoftheweek.length; i++){
          cnt++;
          if(cnt == beforeday) {
              answer = dayoftheweek[i];
              break;
          }
          else if(i == dayoftheweek.length-1 && cnt != beforeday){
              i = -1;       					// ���⼭ i=0���� �س��� ��û ��̽��ϴ�
          }
      }
      
      return answer;
  }
  public static void main(String[] args) {
	  int a = 5;
	  int b = 24;
	  year2016 y = new year2016();
	  
	  String answer = y.solution(a, b);
	  System.out.printf("2016�� %d�� %d���� %s�Դϴ�.", a, b, answer);
  }
}