//type casting


class Main{
    public static void main(String[] args) {
        
        double d = 5.6;
        //int i = d; this will not work. Type mismatch.
        int i = (int) d;

        System.out.println(i);
    }
}





//upcasting and downcasting

class A{
    public void show1(){
        System.out.println("Show A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("Show B");
    } 
}
class Main{
    public static void main(String[] args) {
        
        A obj =  new B();
        obj.show1();
        
        B obj1 = (B) obj;
        obj1.show2();
    }
}
