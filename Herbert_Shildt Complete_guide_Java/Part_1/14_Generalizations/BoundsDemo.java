/**В этой версии класса Stats аргументом типа для Т должен быть
 * либо NUMBER, либо класс, производный от NUMBER
 */
class Stats<T extends Number> {
    T[] nums; //Массив элементов класса Number или его подкласса
              //Передать конструктору ссылку на массив элементов
              //класса NUmber или его подкласса
    Stats(T[] o){
        nums = o;
    }
    // Во всех случаях возвращать результат типа double
    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
 
    }
}

class BoundsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);
        
    }
}
