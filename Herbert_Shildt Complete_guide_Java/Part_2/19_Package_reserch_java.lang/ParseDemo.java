/** В программе суммируется список целых чисел, введенных пользователем
 * С применением parseInt() Строковое представление каждого числа
 * преобразуется в тип int
 */
import java.io.*;
    
class ParseDemo {
    public static void main(String[] args) throws IOException {
        // Создать объект BufferedReader с использованием System.in.
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in, System.console().charset()));
        String str;
        int i;
        int sum=0;

        System.out.println("Введите числа или 0 для выхода.");

        do {
            str = br.readLine();
            try{
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Недопустимый формат");
                i = 0;
            }
            sum += i;
            System.out.println("Текущая сумма: " + sum);
        } while(i !=0);
    }
}
