package inheritance.abstractdemo;

class Graphic
{
    protected int x1, x2, y1, y2;

    public void startWith(int x, int y)
    {
        x1=x;
        y1=y;
    }
    public void endWith(int x, int y)
    {
        x2=x;
        y2=y;
    }

    public void print()
    {
        System.out.print("No Clue");
    }
}

class Line extends Graphic
{
    @Override
    public void print()
    {
     System.out.printf( " draw line from (%d, %d) to (%d,%d) %n", x1,y1,x2,y2);
    }
}

class Rectangle extends Graphic
{
    @Override
    public void print()
    {
        System.out.printf( " draw rectangle from (%d, %d) to (%d,%d) %n", x1,y1,x2,y2);
    }
}
public class Main {

    public static void main(String[] args) {
        Graphic g1=new Graphic();
        g1.startWith(0,0);
        g1.endWith(10,10);
        g1.print();

        Graphic l1=new Line();
        l1.startWith(0,0);
        l1.endWith(10,10);
        l1.print();


    }

}
