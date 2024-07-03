class Human{
    private int age;
    private String name;
    
    public int  getAge()
    {
        return age;
    }
    
    public void setAge(int x)
    {
        age = x;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
   
public class HelloWorld {
    public static void main(String[] args) {
     Human obj = new Human();
     obj.setAge(9);
     obj.setName("Aparna");
    
     System.out.println(obj.getAge());
     System.out.println(obj.getName());
    }
}
