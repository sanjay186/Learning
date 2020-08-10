package polymorphsim;
/*
* private method inherting
* will pass the comple if @overwrite is not mentioned.
*
* */
public class Test {

    private void msg(){
        System.out.println("this is from a superclass method");
    }
}

class SubTest extends Test{

    private void msg(){
        System.out.println("this is from a subClass method");
    }

    public static void main(String[] args) {
        SubTest s = new SubTest();
        s.msg();
    }
}
