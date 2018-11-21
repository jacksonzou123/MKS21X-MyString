public class MyString implements CharSequence{
  private char[] data;

  public MyString(CharSequence s){
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

}
