/**Работа с длинной и емкостью StringBuffer*/
class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("He");
        
        sb.ensureCapacity(16);

        System.out.println("Буфер = " + sb);
        System.out.println("Длинна= " + sb.length());
        System.out.println("Емкость = " + sb.capacity());
    }
}
