package StringManupilation;

import java.io.IOException;

public class stringBuffer {
    public static void main(String[] Args){
        StringBuffer sb = new StringBuffer("sanjay");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("  is a boy"));
        System.out.println(sb.insert(0 , "s."));
        System.out.println(sb.reverse());
//        StringBuilder sbud = new StringBuilder();
//        sbud.

    }

}
