package inheritance;

class Teacher {
  String designation = "Teacher";
  String book = "teaching ";

  public void does() {
    System.out.println("Teaching");
  }
}
class scncteacher extends Teacher{
//  String designation = "Teacher";
//  String book = "teaching ";

  public void does() {
    System.out.println("Teaching scn");
  }
}
class mathTeacher extends  scncteacher {
  String department = "Maths";

  public static void main(String[] Args) {
    mathTeacher m = new mathTeacher();
    System.out.println(m.department + m.book + m.designation);
    m.does();
  }
}
