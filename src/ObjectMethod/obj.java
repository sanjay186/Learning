package ObjectMethod;

public class obj implements Cloneable{
    public static void main(String [] Args) throws CloneNotSupportedException {
//        obj b = new obj();
//    System.out.println(b.toString());
//        System.out.println(b);
//        System.out.println(b.hashCode());
        obj y = new obj();
        System.out.println(y.hashCode());
        System.out.println(y.equals(y));
        System.out.println(y.getClass());

          obj cl = (obj) y.clone();
          System.out.println(cl.hashCode());




    }
}
