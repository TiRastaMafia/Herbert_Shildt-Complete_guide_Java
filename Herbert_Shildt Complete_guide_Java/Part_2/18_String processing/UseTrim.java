/** Использование trim() для обработки команд 
 *                BufferedReader() для получения из консоли
 *                trim() для уберания лишних пробелов
 *                toLowerCase() для удобства сравнения*/

import java.io.*;

class UseTrim {
    public static void main(String[] args) 
        throws IOException
    {
        // Создать экземпляр BufferReader, используя System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        String str;

        System.out.println("Для завершения введите 'стоп' ");
        do{
            System.out.println("Введите название штата: ");
            str = br.readLine();
            str = str.trim();
            str = str.toLowerCase();            

            switch(str) {
                case "иллинойс"     -> {System.out.println("Столица - Спрингфилд");}
                case "миссури"      -> {System.out.println("Столица - Джефферсон-Сити");}
                case "калифорния"   -> {System.out.println("Столица - Сакраменто");}
                case "вашингтон"    -> {System.out.println("Столица = Олимпия");}
                case "стоп"         -> {System.out.println("Выход из базы");}
                default             -> {System.out.println("такого города нет в базе");}    
            }; 

        } while(!str.equals("стоп"));
    }
}
