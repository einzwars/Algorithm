/*�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
 * �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.*/

public class MiddleCharacter {
  public String solution(String s) {
      String answer = "";
      char c;
      int length = s.length();
      int halflength = (length/2);
      
      
      if(length%2 == 0){
          answer = s.substring(halflength-1, halflength+1);
      }
      else{
          c = s.charAt(halflength);
          answer = Character.toString(c);
      }
      
      return answer;
  }
  public static void main(String[] args) {
	  String s = "abcde";
	  MiddleCharacter mc = new MiddleCharacter();
	  
	  String answer = mc.solution(s);
	  System.out.println("��� ���ڴ� : "+answer);
  }
}