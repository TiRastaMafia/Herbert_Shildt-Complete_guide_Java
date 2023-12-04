/** Блочное лямбда-выражение, которое вычесляет факториал значения int*/
interface NumericFunc{
    long func(long n);
}

class BlockLambdaDemo {
    public static void main(String[] args) {
        // Это блочноя лямбда-выражение вычисляет факториал значения int
        NumericFunc factorial = (n) -> {
            long result = 1;

            for(int i=1; i <=n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал 3 равен " + factorial.func(3));
        System.out.println("Факториал 5 равен " + factorial.func(5));
        System.out.println("Факториал 65 равен " + factorial.func(65));

    }
}
