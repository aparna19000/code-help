class Human{
    int age ;
    String name;
}
   
public class HelloWorld {
    public static void main(String[] args) {
     Human obj = new Human();
     obj.age = 11;
     obj.name = "Aprana";
     
     System.out.println(obj.name);
    }
}
----------------------------------------------------------

class Human{
    private int age;
    private  String name;
}
public class HelloWorld {
    public static void main(String[] args) {
     Human obj = new Human();
     obj.age = 11;
     obj.name = "Aparna";
     System.out.println(obj.name);
    }
}
