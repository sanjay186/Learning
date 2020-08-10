package polymorphsim;

public class Test {

    private void msg(){
        System.out.println("this is from a superclass method");
    }
}

class SubTest extends Test{
   @Override
    private void msg(){
        System.out.println("this is from a subClass method");
    }

    public static void main(String[] args) {
        SubTest s = new SubTest();
        s.msg();
    }
}
