class Test2 {
    int a, b;
    Test2(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test2 protos) {
        protos.a *= 2;
        protos.b /= 2;
    }
}

class PassObjRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        
    System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
    ob.meth(ob);
    System.out.println("ob.a и ob.b после вызовв: " + ob.a + " " + ob.b);
    
    }
}
