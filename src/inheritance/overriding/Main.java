package inheritance.overriding;

//Overriding

import groovy.ui.SystemOutputInterceptor;

class Base {
    public void f() {
        System.out.println("f() in Base");
    }

    public void g() {
        System.out.println("g() in Base");
    }
}

class Derived extends Base {

    //override
    public void g() {
        System.out.println("g() in Derived");
    }

    public void h() {
        System.out.println("h() in Derived");
    }
}

public class Main {

    public static void main(String[] args) {

        Base base = new Base();
        base.f();
        base.g();
        System.out.println();

        Derived derived = new Derived();
        derived.f();
        derived.g();
        derived.h();
        System.out.println();

        Base base1 = new Derived();
        base1.g();
        base1.f();


    }
}
