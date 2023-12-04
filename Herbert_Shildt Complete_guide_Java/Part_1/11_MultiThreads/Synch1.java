class Callme {
    void call(String msg) {
        System.out.print("[" + msg);  
        try {
            Thread.sleep(1000);
    } catch (InterruptedException e) {
    System.out.println("Прерван");   
    }  
    System.out.println("]");   
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    //Синхронизированные вызовы call
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

class Synch1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "HELLO");
        Caller ob2 = new Caller(target, "SYNCHRONIZED");
        Caller ob3 = new Caller(target, "WORLD");
    //Запустить потоки
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();
    //Ожитать окончание работы потоков
    try {
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    } catch(InterruptedException e) {
        System.out.println("Прерван");
        }
    }
}




