/** Использование ссылки на метод экземпляра с разными объектами
 *
 * Функциональный интерфейс с меодом, который получает два
 * ссылочных аргумента и возвращает булвский результат
 */
interface MyFunc<T>{
    boolean func(T v1, T v2);
}
// Класс, предназначенный для хранения самой высокой температуры за сутки
class HighTemp{
    private int hTemp;
    HighTemp(int ht) {hTemp = ht; }
    //Возвратить значение true, если вызывающий объект HighTemp
    //содержит такйю же температуру, как у ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }
    //Возвратить true, если вызывающий объект HighTemp
    //содердит температуру которая ниже чем у ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {
    // Метод, возвращающий количество вхождений объекта, для которого выполняются
    // некоторые критерии указанные в параметре MyFunc
    static<T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for(int i=0; i < vals.length; i++)
            if(f.func(vals[i], v))
                count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
        //Создать массив объектов HighTemp
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82),
                                    new HighTemp(90), new HighTemp(89),
                                    new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83) };
        //Использовать counter() С массивами элементов типа HighTemp
        //ОБратите внимание что во втором аргументе передается ссылка
        //на метод экземпляра sameTemp().
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("КОличество суток, когда самая высокая температура была 89 градусов: " + count);
        // Создать и использовать еще один массив лементов типа HighTemp.


        HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13) };

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("КОличество суток, когда самая высокая температура была 12 градусов: " + count);


        //Использовать lessThanTemp() для нахождения суток, когда температура
        //была ниже указанного значения
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Количество суток, когда самая высокая температура была меньше 89 градусов: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Количество суток, когда самая высокая температура была меньше 19 градусов: " + count);
    }
}


