public class q6 {
   public static void meathod1(int x)throws ArithmeticException
   {
        if(x<18)
           throw new ArithmeticException("Age should be less tahn 18");
        else
           System.out.println("Age is fine");
   }
    public static void main(String[] args) {
        try{
            meathod1(10);
            meathod1(21);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
