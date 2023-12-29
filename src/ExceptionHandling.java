public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//             divide(a, b); //arithmetic exception occurs "/0"
            throw  new Exception("Just for Fun");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return  a/b;
    }
}
