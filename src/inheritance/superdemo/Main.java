package inheritance.superdemo;

//super()
class Base {
    public void print() {
        System.out.print(" Hello ");
    }
}

class Derived extends Base{

       @Override
        public void print() {
           //print();// Exception in thread "main" java.lang.StackOverflowError
           super.print();
        System.out.print(" World ");
    }
}


public class Main {

    public static void main(String[] args) {

        Base b1 = new Base();
        b1.print();
System.out.println();
        Derived d1=new Derived();
        d1.print();

    }
}
