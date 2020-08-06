package StringManupilation;

public class StringTest {
    public static void main(String[] Args){

    String s = "sanjay";
    String s1 ="SANJAY";
       System.out.println(s.matches("sanjay"));
        System.out.println(s.hashCode());
        System.out.println(s.charAt(4));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointCount(1,4));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.concat(s1));
        System.out.println(s.contains("ajn"));
      String s2=  s.replaceAll("sanjay","kalai");
        System.out.println(s2);

}
}
