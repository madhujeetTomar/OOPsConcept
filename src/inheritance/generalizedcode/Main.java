package inheritance.generalizedcode;

//Generalized code

class Vehicle {
}

class TwoWheeler extends Vehicle {
}

class FourWheeler extends Vehicle {
}

class Bike extends TwoWheeler {
}

class Car extends FourWheeler {
}

class Human{}

public class Main {

   // public static void test(Vehicle v)
//public static void test(Car v)
//public static void test(TwoWheeler v)
//public static void test(Human v)
 //  public static void test(Object v)
   public static void test(Vehicle v)
    { }

    public static void main(String[] args) {

        test(new Vehicle());
        test(new TwoWheeler());
        test(new FourWheeler());
        test(new Bike());
        test(new Car());
    }
}

class Base
{
    protected Vehicle getVehicle()
    {
        return null;
    }
}

class Derived extends Base
{
   //cannot assign weaker access modifier tha in base class
    // We can define any subclass
   @Override
    protected Bike getVehicle()
    {
        return null;
    }
//OverLoading

    protected Bike getVehicle(int a)
    {
        return null;
    }
}
