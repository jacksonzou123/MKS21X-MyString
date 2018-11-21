public class Driver{
  public static void main(String[] args) {
    MyString a = new MyString("thats digusting");
    System.out.println(a);
    System.out.println(a.length());
    for (int i = 0; i < a.length(); i++) {
      System.out.print(a.charAt(i));
    }
  }
}
