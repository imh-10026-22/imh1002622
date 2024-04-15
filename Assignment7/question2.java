class Circle{
    double radius;
    double area(){
        return 3.14*(radius*radius);
    }
    void set_radius(double radius){
        this.radius = radius;
    }
    
    double circumference(){
        return 2*3.14*radius;
    }
    
    double perimeter(){
        return 2*3.14*radius;
    }
}
 
 
class Cylinder extends Circle{
    double height;
    Cylinder(double height){
        super();
        this.height = height;
    }
    
    double volume(){
        return super.area()*height;
    }
}
 
class runner{
    public static void main(String[]args){
        Cylinder C1 = new Cylinder(12);
        C1.set_radius(2);
        System.out.println("Area of the Circle is :"+C1.area());
        System.out.println("Volume of the Cylinder is :"+C1.volume());
    }
}
