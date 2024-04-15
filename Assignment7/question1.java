class Shape{
    float getArea(){
        return 0;
    }
}
 
class Rectangle extends Shape{
    float width;
    float length;
    Rectangle(float width,float length){
        this.width = width;
        this.length = length;
    }
    
    float getArea(){
        return width*length;
    }
}
 
class Box extends Rectangle{
    float height;
    Box(float width,float length,float height){
        super(width,length);
        this.height = height;  
    }
    
    float getArea(){
        return 2*(length*width + width*height + length*height);
    }
}
 
 
 
class Runner{
    public static void main(String[]args){
        Shape S1 = new Shape();
        Rectangle R1 = new Rectangle(15,12);
        Box B1 = new Box(12,12,12);
        System.out.println("Area of the Shape is :"+S1.getArea());
        System.out.println("Area of the Rectangle is :"+R1.getArea());
        System.out.println("Area of the Box is :"+B1.getArea());
    }
}
 
