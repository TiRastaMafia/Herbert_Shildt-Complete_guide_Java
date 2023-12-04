class A {
    void callme() {
        System.out.println("Внутри метода callme() класса А");
    }
}

class B extends A {
    void callme() {
        System.out.println("Внутри метода callme() класса B");
    }
}

class C extends B {
    void callme() {
        System.out.println("Внутри метода callme() класса C");
    }
}

class Dispatch {
    public static void main(String [] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();

    
   
    }
}
