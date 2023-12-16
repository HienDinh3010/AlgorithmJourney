package javaquestion.interview.throwAndthrows;

public class ExistFinallyBlock {

    public static float divide(String a, String b) {
        try{
            Float aF = Float.valueOf(a);
            Float bF = Float.valueOf(b);
            return aF.floatValue() / bF.floatValue();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            System.exit(1);
            //throw new ArithmeticException("Divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
            System.exit(1);
            //throw new NumberFormatException("Wrong number format");
        } finally {
            System.out.println("I am at the finally block code");
        }
        return 0;
    }

    public static void main(String[] args) {
        //System.out.println(divide("6", "3"));
        //System.out.println(divide("6", "0"));
        System.out.println(divide("abc", "0"));
    }
}
