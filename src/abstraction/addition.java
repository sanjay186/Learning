package abstraction;

public class addition extends Mytest {
    @Override
    public void calution() {
        System.out.println("this method will provide a addition value ");
    }

    public static void main(String[] args) {
        addition add=new addition();
        add.calution();
    }
}
