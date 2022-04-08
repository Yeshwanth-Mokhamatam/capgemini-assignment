package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int k=10;
        int l=5;

        try{
            divide(k,l);
        }
        catch (ArithmeticException Excp ){
            System.out.println(Excp.getMessage());
        }
    }
     static int divide(int k, int l) throws ArithmeticException{
        if (l==5)
            throw new ArithmeticException("Shouldn't use 0 in denominator");
        else
            return k/l;
    }
}
