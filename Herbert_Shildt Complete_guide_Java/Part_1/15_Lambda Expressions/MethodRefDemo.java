/** Демонстрация использования ссылки на статический метод
 *
 * Функциональный интерфейс для операций над строками*/
interface StringFunc {
    String func(String n);
}

//В этом классе определен статический метод по имени strReverse().
class MyStringOps {
    //Статический метод, который изменяет порядок следования 
    //символов на противоположный
    static String strReverse(String str) {
        String result = "";
        int i;
        
        for(i = str.length()-1; i >=0; i--)
            result += str.charAt(i);
        return result;
    }
}
class MethodRefDemo {
    //Первый параметр этого метода имеет тип функционального интерфейса
    //Таким образом, ему можно передать любой экземпляр реализации
    //интерфейса StringFunc, включая ссылку на метод
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        // Переделать в stringOp() ссылку на статический метод strReverse()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Строка с противоположным порядком следования символов: " + outStr);
    }
}
