//public class StaticDemo {
//    static int a = 10;
//    static void display(){
//        System.out.println("Static method");
//    }
//    public static void main(String args[]){
//        System.out.println(a);
//        display();
//    }
//}
//Output:
//10
//Static method


//class Demo {
//    static int a = 10;
//    static void display(){
//        System.out.println("Static method");
//    }
//}
//class StaticDemo {
//    public static void main(String args[]){
//        System.out.println(Demo.a);
//        Demo.display();
//    }
//}
//10
//Static method


//class Demo {
//    static int a = 10;
//    static void display(){
//        System.out.println("Static method");
//    }
//    static{
//        System.out.println("static block");
//    }
//}
//class StaticDemo {
//    public static void main(String args[]){
//        System.out.println("Main method");
//        System.out.println(Demo.a);
//        Demo.display();
//        //if System.out.println(Demo.a); is not there
//        //Main method
//        //static block
//        //Static method
//    }
//}
//Main method
//static block
//10
//Static method

class Demo {
    static int a = 10;//static variable
    static void display(){//static method
        System.out.println("Static method");
    }
    static{//static block
        System.out.println("static block");
    }
    public static void main(String args[]) {
        System.out.println("Main method");
        System.out.println(a);
        display();
        //if System.out.println(a); is not there
        //static block
        //Main method
        //Static method
        
        //if display() is not there
        //static block
        //Main method
        //10
    }
}
//static block
//Main method
//10
//Static method

//public class StaticVariableExample
//{
//    static int a =10;
//    public static void main(String args[]){
//        StaticVariableExample s1 = new StaticVariableExample();
//        StaticVariableExample s2 = new StaticVariableExample();
//        System.out.println("s1.a value :"+s1.a);
//        System.out.println("s2.a value :"+s2.a);
//        //Change s1 a value alone
//        s1.a=20;
//        System.out.println("s1.a value :"+s1.a);
//        System.out.println("s2.a value :"+s2.a);
//    }
//}
//Output will be
//s1.a value :10
//s2.a value :10
//s1.a value :20
//s2.a value :20