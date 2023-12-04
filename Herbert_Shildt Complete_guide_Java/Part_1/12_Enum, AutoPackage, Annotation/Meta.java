import java.lang.annotation.*;
import java.lang.reflect.*;

//объявление аннотации типа
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
    // Аннотировать метод
    @MyAnno(str = " Пример аннотации ", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        //Получчить аннотацию для этого метода
        //и отобразить значения для её классов
        try {
            //Для начала получить объект Class
            // который представляет данный класс
            Class<?> c = ob.getClass();
            //ТЕперь получть объект Method
            //Который представляет данный метод
            Method m = c.getMethod("myMeth");
            
            //Далее получить аннотацию для этого класса 
            MyAnno anno = m.getAnnotation(MyAnno.class);

            //В заключение вывести значания
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найдет");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
