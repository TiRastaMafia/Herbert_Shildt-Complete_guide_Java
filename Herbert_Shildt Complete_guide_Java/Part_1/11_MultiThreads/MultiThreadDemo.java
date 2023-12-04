// Создание множества потоков
class NewThread implements Runnable {
    String name; //имя потока
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
    }
    // точка входа для потока
    public void run() {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}


class NewSubThread implements Runnable {
    String name; //имя потока
    Thread subt;
    NewSubThread(String threadname) {
        name = threadname;
        subt = new Thread(this, name);
        System.out.println("Новый sub поток: " + subt);
    }

    public void run() {
        try{
            for(int j = 5; j > 0; j--) {
                System.out.println(name + ": " + j);
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewSubThread subnt1 = new NewSubThread("SUB One");
        NewThread nt2 = new NewThread("Two");
        NewSubThread subnt2 = new NewSubThread("SUB Two");
        NewThread nt3 = new NewThread("Three");
        NewSubThread subnt3 = new NewSubThread("SUB Three");
        NewThread nt4 = new NewThread("Four");
        NewSubThread subnt4 = new NewSubThread("SUB Four");
    // запустить потоки
    nt1.t.start();
    subnt1.subt.start();
    nt2.t.start();
    subnt2.subt.start();
    nt3.t.start();
    subnt3.subt.start();
    nt4.t.start();
    subnt4.subt.start();
    try {
    // Ожидать окончания остальлных потоков
    Thread.sleep(10000);
    } catch (InterruptedException e) {
        System.out.println("Главный поток прерван");
    }
    System.out.println("Завершение главного потока");
    }
}
