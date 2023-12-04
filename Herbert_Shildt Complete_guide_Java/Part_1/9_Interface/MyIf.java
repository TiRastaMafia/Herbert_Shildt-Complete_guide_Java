public interface MyIf {
    // Это объявление НОРМАЛЬНОГО меода интерфейса
    // в нем НЕ определяется стандартная реализация
    int getNumber();

    // Это стандартныйй метод он передставляет СТАНДАРТНУЮ реализация
    default String  getString() {
        return "Стандартная строка";
    }

    static int getDefaultNumber() {
        return 150;
    }
}

class MyIFImp implements MyIf {
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIf {
    public int getNumber() {
        return 200;
    }

    public String getString() {
        return "Another line";
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp2 obj = new MyIFImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        
        System.out.println(MyIf.getDefaultNumber());
        
    }    
}
