package ObjectMethod;

 public class finlclass {
  final public void does(){
       System.out.println("does somethings!!");
    }
}

final class test extends finlclass{
  /*   public void does(){

     }*/
   public static void main(String [] Args){
       finlclass n = new test();
       n.does();
   }
}
