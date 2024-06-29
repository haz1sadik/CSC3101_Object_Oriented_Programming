package Files.Amir;

public  class Test1 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException ex){
            System.out.println("Runtime Exception 1");
        } catch (Exception e){
            System.out.println("Exception");
        }
    }
    static void method() throws  Exception{
        try {
            String s = "5.6";
            Integer.parseInt(s);
            int i = 0;
            int y = 2 / i;
            System.out.println("Welcome to Java");
        }catch (NumberFormatException ex){
            System.out.println("Number format exception");
            throw ex;
        }catch (RuntimeException ex){
            System.out.println("Runtime Exception 2");
        }
    }
}