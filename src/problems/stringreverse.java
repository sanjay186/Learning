package problems;

public class stringreverse {

  public static void main(String[] args) {
    //
    String str = "sanjay";
    StringBuilder sb = new StringBuilder();
    String str1 = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      char b = str.charAt(i);
      sb.append(b);
    }
    str1 += sb.toString();
    System.out.println(str1);
  }
}
