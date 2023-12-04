/** Создание строки из поддиапазона массива байтов */
class SubStringCons {
    public static void main(String[] args) {
        byte[] ascii = {65, 66, 67, 68, 69, 70};
        byte[] charNew = {14};
        String s3 = "abc def";
        


        String charNew1 = new String(charNew);
        System.out.println(charNew1);

        String s1 = new String(ascii);
        System.out.println(s1);
                                                
        String s2 = new String(ascii, 2, 4); // из какого объекта брать начальную позицию и кол-во элементов
        System.out.println(s2);

        //Длинна строки
        System.out.println(s1.length());

        System.out.println(s3.length() + " " + (2 + 2));
    }
}
