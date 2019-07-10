/*2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)*/

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
              i = -1;       					// 여기서 i=0으로 해놓고 엄청 헤맸습니다
          }
      }
      
      return answer;
  }
  public static void main(String[] args) {
	  int a = 5;
	  int b = 24;
	  year2016 y = new year2016();
	  
	  String answer = y.solution(a, b);
	  System.out.printf("2016년 %d월 %d일은 %s입니다.", a, b, answer);
  }
}