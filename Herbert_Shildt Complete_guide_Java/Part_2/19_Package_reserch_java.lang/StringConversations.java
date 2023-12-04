/** Преобразование целого числа в двоичную,
 * шеснадцатеричную и восьмеричную строку
 */

class StringConversations {
    public static void main(String[] args) {
        int num = 255;
        System.out.println(num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println(num + " в восьмиричной форме: " + Integer.toOctalString(num));
        System.out.println(num + " в шеснадцатиричной форме: " + Integer.toHexString(num));
    }
}
