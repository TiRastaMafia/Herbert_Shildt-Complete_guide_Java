class IndexOfDemo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("one two one four four one");
        int i;

        i = sb.indexOf("o");
        System.out.println("Индекс первого вхождения: " + i);
    
        i = sb.lastIndexOf("n");
        System.out.println("Индекс последнего вхождения: " + i);
    }
}
