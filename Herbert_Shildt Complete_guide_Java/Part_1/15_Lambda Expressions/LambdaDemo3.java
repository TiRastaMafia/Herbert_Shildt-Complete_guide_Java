/** Демонстрация использования лямбда-выражения, принимающего два параметра*/
interface NumericTest2 {
    boolean test(int n, int d);
}
class LambdaDemo3 {
    public static void main(String[] args) {
        // Это лямбда-выражение выясняет, является ли одно число
        // множетелем другого
        NumericTest2 isFactor = (n, d) -> (n % d) == 0; 
        if(isFactor.test(10, 2))
            System.out.println("2 является множетелем 10");
        
        if(!isFactor.test(10, 3))
            System.out.println("3 не является множетелем 10");
    }
}
