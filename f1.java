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
Every time u create a instance variable make it private, nobody should be able to use it, so u might think, if noone is able to access the data, 
then y are we making it. I mean we make it for people to access them, but not directly. 
    We should be able to use by methods, by behavour

class Human{
    private int age =11;
    private String name = "Aparna";
    
    public int  getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
   
public class HelloWorld {
    public static void main(String[] args) {
     Human obj = new Human();
     //obj.age = 11;
     //obj.name = "Aprana";
    
     System.out.println(obj.getAge());
     System.out.println(obj.getName());
    }
}
    
