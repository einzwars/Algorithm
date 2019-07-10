/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.*/

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
	  System.out.println("가운데 글자는 : "+answer);
  }
}