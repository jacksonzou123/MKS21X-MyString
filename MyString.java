public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  public MyString(int length) {
    data = new char[length];
  }

  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index) {
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    CharSequence f = "";
    for (int i = start; i < end; i++) {
      f += data[i];
    }
    return "yes";
  }

  public String toString() {
    String f = "";
    for (int i = 0; i < data.length; i++) {
      f+= data[i];
    }
    return f;
  }

  public int compareTo(CharSequence s) {
    return 0;
  }
}
