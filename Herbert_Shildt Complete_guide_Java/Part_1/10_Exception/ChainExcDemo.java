// Демонстрация работы сцепленных исключений
class ChainExcDdemo {
    static void demoproc() {
        //создать исключение
       NullPointerException e = 
           new NullPointerException("верхний уровень");
       // добавить причину
       e.initCause(new ArithmeticException("причина"));
        throw e;
    }
    public static void main(String[] args) {
        try{
            demoproc();
        } catch(NullPointerException e) {
            // отобразить исключение верхнего уровня
           System.out.println("Перехвачено: " + e);
           //отобразить исключение-причину
           System.out.println("Первоначальная причина: " + e.getCause());
        }
    }
}
