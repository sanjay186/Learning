package Singleton;

public class Singletion {
//    private static Singletion singletion = null;
//    private Singletion(){ }
//
//    public static Singletion getInstance(){
//
//        if(singletion==null){
//            singletion = new Singletion();
//        }
//        return singletion;
//    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singletion{" +
                "name='" + name + '\'' +
                '}';
    }
}
