public class class35 {
    public static void main(String args[]){
        System.out.println("hii");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println("bye");
    }
}
