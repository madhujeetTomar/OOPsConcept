package inheritance;

//Reuse Code
class BasicCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

class ScientificCalc extends BasicCalc {
    public double sin(int deg) {
        double radian=deg*3.1459/180;
    return Math.sin(radian);
    }
}


public class Main {
    public static void main(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        basicCalc.add(10, 20);
        System.out.println("Addition: " + basicCalc.add(10, 20));
        System.out.println("Subtraction: " + basicCalc.subtract(10, 20));
        System.out.println();
// Call add and subtract method through subClass
        /**
         * Call add and subtract method through subClass
         *Since scietific calc extends the Basic calc so it inherited all the property of Basic calc
         * So it is not required to write again the same method in subclasses
         */
        ScientificCalc scientificCalc = new ScientificCalc();
        System.out.println("Addition using SubClass: " + scientificCalc.add(10, 20));
        System.out.println("Subtraction using subClass: " + scientificCalc.subtract(10, 20));
        System.out.println();
//call the additional method defined in class ScientificCalc
       /**
        *  Now when we create object for ScientificCalc we can call BasicCalc methods as well as ScientificCalc methods.
        *  But through BasicCalc object we can only call add() and subtract().
        */

        System.out.println("Value for Sin 90: "+scientificCalc.sin(90));


        BasicCalc basicCalc1=new ScientificCalc();
        System.out.println("Add: " + basicCalc1.add(10, 20));
        System.out.println("Subtract: " + basicCalc1.subtract(10, 20));
        System.out.println("Subtract: " + basicCalc1.subtract(10, 20));
        /**
         * It can only refer to the members of BasicCalc. Because compiler only knows the type information not the
         * object
         * basicCalc1.sin(90) is not valid
         * Using Type casting we can achieve it
         */


        System.out.println("Using Type Casting Value for Sin 90: "+((ScientificCalc)basicCalc1).sin(90));

    }
}
