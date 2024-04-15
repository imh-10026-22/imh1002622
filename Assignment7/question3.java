class Rectangle{
    double length;
    double breadth;
    Rectangle(){
        length = 1;
        breadth = 1;
    }
 
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
 
}
 
class Cuboid extends Rectangle{
    double height;
    Cuboid(){
        super();
        height = 1;
    }
    Cuboid(double height){
        super();
        this.height = height;
    }
 
    double volume(){
        return length*breadth*height;
    }
}
 
class runner3{
    public static void main(String[]args){
        Cuboid C1 = new Cuboid();
        Cuboid C2 = new Cuboid(12);
        System.out.println("The volume of the first cuboid is :"+C1.volume());
        System.out.println("The volume of the Second cuboid is :"+C2.volume());
 
    }
}
