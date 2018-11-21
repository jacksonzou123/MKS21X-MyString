public class MyString implements CharSequence{
  private char[] data;

  public MyString(CharSequence s){
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    try {
      return data[i];
    }catch(ArrayIndexOutOfBounds e) {
      System.out.println("Invalid index");
    }
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    CharSequence f = new CharSequence();
    for (int i = start; i < end; i++) {
      f+= data[i];
    }
    return f;
  }

  public String toString() {
    String f = "";
    for (int i = 0; i < data.length; i++) {
      f+= data[i];
    }
    return f;
  }
}
