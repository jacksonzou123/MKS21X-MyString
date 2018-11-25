public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;

  public MyString(int length) {
    try {
      data = new char[length];
    }catch(NegativeArraySizeException e) {
      System.out.println("Invalid length for MyString");
    }
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
    String f = "";
    for (int i = start; i < end; i++) {
      f += charAt(i);
    }
    return f;
  }

  public String toString() {
    String f = "";
    for (int i = 0; i < data.length; i++) {
      f+= charAt(i);
    }
    return f;
  }

  public int compareTo(CharSequence s) {
    for (int i = 0; i < this.length(); i++) {
      if (i > s.length()) {
        return this.length()-s.length();
      }
      if (charAt(i) != s.charAt(i)) {
        return charAt(i) - s.charAt(i);
      }
    }
    if (s.length() > this.length()) {
      return s.length()-this.length();
    }
    return 0;
  }
}
