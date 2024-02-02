public class Car {
    String brand;
 
    public Car() {
        this.brand = "FORD";
    }

  
    public String getBrand(){
        return this.brand;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Car cr= new Car();
        String a = cr.getBrand();
        System.out.println(a);
    }
}
