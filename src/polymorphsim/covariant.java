package polymorphsim;

/*
* Covariant Return types in Java | As you know that in the overriding, the return type of subclass method must be the
* same as the superclass method return type.
But this rule is applicable until Java 1.4 version.
* In Java 1.5, a new covariant return types feature was introduced.
By using this feature, it is possible to override any method by changing
* the return type only if the return type of overriding method in the subclass
* is a subtype of the declared return type of overridden method instead of being
* exactly the same type. It is known as covariant return types in Java.
*
*
* */


  class covariant {



      public Number show(){
        System.out.println("this is from superclass:");
        return 1;
    }
      public Object show1(){
          System.out.println("this is from superclass:");
          return null;
      }
}
class MyTest extends covariant {
    @Override
    public Integer show() {
        System.out.println("this is from subclass:");
        return 9;
    }
    @Override
    public String show1(){
        System.out.println("this is from subclass:");
        return null;
    }
    public void self(){
        System.out.println("this is from self methd subclass:");
    }

    public static void main(String[] args) {
        MyTest m = new MyTest();
        m.show();
        m.show1();
        m.self();

        covariant c= new MyTest();
        c.show();
        c.show1();
    }
}
