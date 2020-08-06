package abstraction;

public class subration extends Mytest{
    @Override
    public void calution() {
        System.out.println("this method will provide a subration value ");
    }

    public static void main(String[] args) {
        subration sub = new subration();
        sub.calution();
    }
}
