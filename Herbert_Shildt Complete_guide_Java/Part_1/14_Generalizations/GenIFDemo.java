/** Пример обобщенного интерфейса
 * Интерфейс для нахождения минимального имаксимального значений*/
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

/**Реализовать интерфейс MinMax
 */

class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o){
        vals = o;
    }
// Возвратить минимальное значение в vals
    public T min(){
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) < 0)
                v = vals[i];
        return v;
    }


// Возвратить максимальное значение в vals
    public T max() {
        T v = vals[0];
        for(int i=1; i < vals.length; i++)
            if(vals[i].compareTo(v) > 0)
                v = vals[i];
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Double[] dnums = {1.1, 2.2, 3.3, 4.4};
        Character[] chs = {'i', 'a', 'z', 'w'};
        String[] str ={"aproximation","xyy","xyz","abc"};


        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Double> dob = new MyClass<Double>(dnums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        MyClass<String> sob = new MyClass<String>(str);

        System.out.println("Максимальное значение в inums: " + iob.max());
        System.out.println("Минимальное значение в inums: " + iob.min());

        System.out.println("\nМаксимальное значение в dnums: " + dob.max());
        System.out.println("Минимальное значение в dnums: " + dob.min());

        System.out.println("\nМаксимальное значение в chs: " + cob.max());
        System.out.println("Минимальное значение в chs: " + cob.min());
    
        System.out.println("\nМаксимальное значение в str: " + sob.max());
        System.out.println("Минимальное значение в chs: " + sob.min());
    

    }
}
