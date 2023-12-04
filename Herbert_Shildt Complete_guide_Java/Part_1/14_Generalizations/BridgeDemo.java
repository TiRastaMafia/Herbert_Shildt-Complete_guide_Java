// Ситуация, в которой создается мостовой метод
class Gen<T> {
    T ob; // Объявить объект типа Т
          //
          // Передать конструктору ссылку на объект типа Т
    Gen(T o) {
        ob = o;
    }
    //  Возвратить ob
    T getOb() {
        return ob;
    }
}

// Покласс Gen
class Gen2 extends Gen<String> {
    Gen2(String o) {
        super(o);
    }
    // Переопределенная версия getOb() специфичная для String
    String getOb() {
        System.out.print("Вызван метод getOb(), специфичный для String: ");
        return ob;
    }
}

/** Демонстрация ситуации, когда требуется мостовой метод*/
class BridgeDemo {
    public static void main(String[] srgs) {
        Gen2 strOb2 = new Gen2("Тест обобщений");

        System.out.println(strOb2.getOb());
    }
}
