class A {
    int i, j;
    void show_ij() {
        System.out.println("i и j: " + i + " " + j);
    }
} 
class B extends A {
    int k;
    void show_k() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

class SimpleInheriance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Содержимое superOb: ");
        superOb.show_ij();
        System.out.println();
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое subOb: ");
        subOb.show_ij();
        subOb.show_k();
        System.out.println();

        System.out.println("Сумма i j k в subOb");
        subOb.sum();
    }
}


