class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}


class InstanceOf {
    public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();
    if(a instanceof A)
        System.out.println("а является экз А");
    if(b instanceof B)
        System.out.println("b является экз B");
    if(c instanceof C)
        System.out.println("c является экз С");
    if(c instanceof A)
        System.out.println("c является экз A");
    if(a instanceof C)
        System.out.println("a  можно привести к C\n");

    // Сравнить типы произвольных классов
    A ob;

    ob = d; //ссылка на d
        
        System.out.println("ob теперь ссылается на d");
        if(ob instanceof D)
        System.out.println("ob является экземпляром D\n");
    
    ob = c; // ссылка на с

        System.out.println("ob теперь ссылается на с\n");

        if(ob instanceof D)
        System.out.println("ob можно привести к D\n");
        else 
            System.out.println("ob нельзя привести к D\n");
        if(ob instanceof A)
        System.out.println("ob можно привести к A\n");

        // ВСЕ ОБЪЕКТЫ МОЖНО ПРИВЕСТИ К OBJECT
        if(a instanceof Object)
        System.out.println("a можно привести к Object\n");

        if(b instanceof Object)
        System.out.println("b можно привести к Object\n");

        if(c instanceof Object)
        System.out.println("c можно привести к Object\n");

        if(d instanceof Object)
        System.out.println("d можно привести к Object\n");
    }
}
