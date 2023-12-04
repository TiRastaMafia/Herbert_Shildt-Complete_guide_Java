// Создание второго потока
class NewThread implements Runnable {
    Thread t1;

    NewThread() {
        // Создать новый, второй поток
        t1 = new Thread(this, "Demo ThreadT1");
        System.out.println("Дочерний поток t1: " + t1);
    }
    // Это точка входа для второго потока
    public void run() {
    try{
        for(int i = 5; i > 0; i--) {
            System.out.println("Дочерний поток t1: " + i);
            Thread.sleep(999);
        }
    } catch (InterruptedException e) {
        System.out.println("Дочерний поток t1 прерван");
    }
    System.out.println("Завершение дочернего потока t1");
    }
}

class NewThread2 implements Runnable {
    Thread t2;

    NewThread2() {
        // Создать новый, второй поток
        t2 = new Thread(this, "Demo ThreadT2");
        System.out.println("Дочерний поток t2: " + t2);
    }
    // Это точка входа для второго потока
    public void run() {
    try{
        for(int i = 5; i > 0; i--) {
            System.out.println("Дочерний поток t2: " + i);
            Thread.sleep(1000);
        }
    } catch (InterruptedException e) {
        System.out.println("Дочерний поток t2 прерван");
    }
    System.out.println("Завершение дочернего потока t2");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread();
        nt1.t1.start();                   // запустить новый поток
        NewThread2 nt2 = new NewThread2();
        nt2.t2.start();
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("************Главный поток: " + i);
                Thread.sleep(1500);
            }
        } catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
        
/*      NewThread2 nt2 = new NewThread2(); // создать новый поток
        nt2.t2.start();                   // запустить новый поток
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("_______________Главный поток: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
*/        
    }
}

