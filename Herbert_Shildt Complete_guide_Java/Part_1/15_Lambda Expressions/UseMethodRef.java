/** Использоование ссылки на метод при ппоиске максимального значения в коллекции*/
import java.util.*;

class MyClass {
    private int val;
    MyClass(int v) {
        val = v;
    }
    int getVal() {
        return val;
    }
}

class UseMethodRef {
    // Метод compareMC() совместный с методом compare()
    // который определен в Comparator<T>
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

public static void main(String[] args) {
    ArrayList<MyClass> al = new ArrayList<MyClass>();
    al.add(new MyClass(1));
    al.add(new MyClass(6));
    al.add(new MyClass(4));
    al.add(new MyClass(2));
    al.add(new MyClass(3));
    al.add(new MyClass(7));
// НАйти максимальное значение в al используя метод compareMC()
MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
System.out.println("Максимальное значение равно: " + maxValObj.getVal());
}
}
