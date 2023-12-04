/** Хронометраж выполнения программы*/
class Elapsed {
    public static void main(String[] args) {
        long start, end;

        System.out.println("Хронометраж цикла for от 0 до 10 000 000 000");
        //Хронометрировать цикл for от 0 до 100 000 000
        start = System.nanoTime(); // получить время начала
        for(long i=0; i < 100; i++);
        end = System.nanoTime(); // получить время окончания

        System.out.println("Затраченное время: " + (end-start));
    }
}
