/** Использование append() для String и insert() <- для StringBuffer()*/
class AppendDemo{
    public static void main(String[] args) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);

        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(sb.insert(7, " I love Java"));
        
        System.out.println(sb.reverse());
    }
}
