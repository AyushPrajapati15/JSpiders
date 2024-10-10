public class arthmetic_excp {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        int a = 10;

        System.out.println(a-2);
        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        System.err.println(a+5);
        System.out.println(a*8);
        
    }
    
}
