/** НЕобобщенный класс может быть суперклассом обобщенного подкласа
 * Необобщенный класс*/

class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }
    
    int getnum() {
        return num;
    }
}

/**Обобщенный подкласс*/
class Gen<T> extends NonGen {
    T ob; // объявить объект типа Т
    // Передать конструктору ссылку на объект типа Т
    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    //Возвратить ob
    T getOb() {
        return ob;
    }
}

/** Создать объект Gen*/
class HierDemo2 {
    public static void main(String[] args){
    // Создать объект Gen дяя String
    Gen<String> w = new Gen<String>("Добро пожаловать", 47);

    System.out.print(w.getOb() + " ");
    System.out.println(w.getnum());
    }
}
