/**
 * Main
 */


public class Main {
    public static void main(String[] args) {
            try {
               FinallyDemo.procA();
            } catch (Exception e) {
                System.out.println("Исключение перехвачено");
            }
            FinallyDemo.procA();
            FinallyDemo.procA();
        }

    
}
