import java.util.*;

class Area
{
    int length, breadth, area;
    Area(int... sides)
    {
        if(sides.length == 2)
        {
            length = sides[0];
            breadth = sides[1];
        }
        else
        {
            length = sides[0];
        }
    }
    Area()
    {
        length = 0;
        breadth = 0;
        area = 0;
    }
    void calculateArea()
    {
        if(breadth == 0)
            area = length * length;
        else
            area = length * breadth;
    }
    void displayArea()
    {
        System.out.println("Area is : " + area);
    }
    public static void main(String[] args)
    {
        Area obj1 = new Area(10);
        Area obj2 = new Area(8, 9);
        Area obj3 = new Area();
        obj1.calculateArea();
        obj1.displayArea();
        obj2.calculateArea();
        obj2.displayArea();
        obj3.calculateArea();
        obj3.displayArea();
    }
}
