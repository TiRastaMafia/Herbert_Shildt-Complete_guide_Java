/** Простые математические функции*/
package appfuncs.simplefuncs;

public class SimpleMathFuncs {
    // Выяснить, является ли а делителем b
    public static boolean isFactor(int a, int b) {
        if((b%a) == 0) 
            return true;
        return false;
    }

    // Возвратить наименьший положительный делитель, общий для a и b
    public static int icf(int a, int b) {
        // РАзложить на множетели, используя положительные значения
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = 2; i <= min/2; i++) {
            if(isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }
    
    //Возвратить наибольший положительный делитель для a и b

    public static int gcf(int a, int b) {
        // РАзложить на множетели, используя положительные значения
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = min/2; i >= min/2; i--) {
            if(isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    
}
