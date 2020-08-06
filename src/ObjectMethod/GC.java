package ObjectMethod;

public class GC {
    public static void main(String[] Args) {
        GC g = new GC();
        System.out.println(g.hashCode());
        g = null;
        System.out.println("Start GC ");
System.gc();
        System.out.println("End ");
    }

    @Override
    protected void finalize(){
        System.out.println("inside the finalize method ");
    }
}

