/**ДЕмонстрация определения простого общего метода*/
class GenMethDemo {
    //Выяснить, присутствует ли объект в массиве
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for(int i=0; i<y.length; i++)
            if(x.equals(y[i])) 
                return true;
        return false;
    }
    public static void main(String[] args) {
        //Использовать isIn() для объектов Integer
        Integer[] nums = {1, 2, 3, 4, 5};
        int dig = 2;
        if(isIn(dig, nums))
            System.out.println(dig + " присутствует в nums");
        int dig2 = 3;
        if(isIn(dig2, nums))
            System.out.println(dig2 + " присутствует в nums");
        System.out.println();
        // Использовать  isIn() для объектов String
        String[] strs = {"one", "two", "three",
                        "four", "five"};
        String day = "two";
        if(isIn(day, strs))
            System.out.println(day + " присутствует в strs");
        String day2 = "ten";
        if(!isIn(day2, strs))
            System.out.println(day2 + " не присутствует в strs");

        Double[] doub = {1.1, 2.2, 3.3, 4.4};
        Double num = 2.2;
        if(isIn(num, doub))
            System.out.println(num + " присутствует в doub");
        Double num2 = 5.5;
        if(!isIn(num2, doub))
            System.out.println(num2 + " не присутствует в doub");
        
    }
    
}

