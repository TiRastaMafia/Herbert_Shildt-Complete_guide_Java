/** Реализация простой фабрики классов с использованием ссылки на конструктор*/
interface MyFunc<R, T> {
    R func(T n);
}

//Простой обобщенный класс
class MyClass<T> {
    private T val;
    // Конструктор, принимающий аргумент
    MyClass(T v) {
        val = v;
    }
    // Стандартный конструктор в Этой программе не используется
    MyClass() {
        val = null;
    }
    
    T getVal() {
        return val;
    };
}

//ПРостой необобщенный класс
class MyClass2 {
    String str;
    // Конструктор, принимающий аргумент
    MyClass2(String s) {
        str = s;
    }
    // Стандартный конструктор В этой программк НЕ используется
    MyClass2() {
        str = "";
    }
    String getVal(){
        return str;
    };
}

class ConstructorRefDemo3 {
    // Фабричный метод для объектов класса. Класс обязан иметь
    // конструктор, который принимает один параметр типа Т
    // Тип создаваемого объекта указывается в R
    static<R,T> R myClassFactory(MyFunc<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass
        // В этом случае new ссылается на конструктор, принимающий аргумент
        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;

        //Создать экземпляр MyClass с применением фабричного метода
        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);

        //Использовать только что созданный экземпляр MyClass
        System.out.println("val в mc равно " + mc.getVal());

        //Теперь создать другой класс с применением MyClassFactory()
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        //Создать экземпляр MyClass2 используя фабричный метод
        MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");

        //Использоывать только что созданный экземпляр MyClass2
        System.out.println("str в mc2 равно " + mc2.getVal());
    }
}
