/** Переопределение обобщенного метода в обобщенном классе*/
class Gen<T> {
    T ob; // ОБъявитьобъект типа Т
          // Передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }
    // Возвратить ob
    T getOb() {
        System.out.print("getOb() в Gen: ");
        return ob;
    }
}

/**Подкласс Gen в котором переопределяется getOb();*/
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
    // Переопределить getOb();
    T getOb() {
        System.out.print("getOb() в Gen2: ");
        return ob;
    }
}
// ДЕмонстрация переопределения обобщенного метода
class OverrideDemo{
    public static void main(String[] args) {
        // Создать объект Gen для Integer
        Gen<Integer> iOb = new Gen<Integer>(88);

        // СОздать объект Gen2 для Integers
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // Создать объект Gen2 для String
        Gen2<String> strOb2 = new Gen2<String> ("Тест обобщений");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
