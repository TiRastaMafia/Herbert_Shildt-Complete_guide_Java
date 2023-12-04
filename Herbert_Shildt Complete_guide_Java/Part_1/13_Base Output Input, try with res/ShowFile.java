
//                             ВАРИАНТ БЕЗ АВТОМАТИЧЕСКОГО ЗАКРЫТИЯ ФАЙЛА ПОСЛЕ ТОГО КАК ОН НЕ НУЖЕН
//
/*import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fis;

        // Удостоверится что имя файла было указанно
        if(args.length !=1) {
            System.out.println("Using ShowFile");
            return;
        }
        //попытка открыть файл
        
        try {
            fis = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("file hasnt open");
            return;
        }
        //В данной точке файл открыт и может быть использован
        //Следующий код читает символы до тех пор пока не встретится EOF
        try{
            do {
                i = fis.read();
                if(i != -1) System.out.print((char)i);
            } while(i != -1);
        } catch(IOException e) { System.out.println("Error file reading");
    }
    try {
        fis.close();
    } catch(IOException e) {System.out.println("Error file closing"); }

    }
}

*/

/* В этой версии программы используется оператор TRY с ресурсами для автоматического закрытия файла после того как он больше не нужен
 *
 * */
import java.io.*;

class ShowFile {

public static void main(String[] args) 
{
    int i;
    // удостоверится что имя файла было указанно
    if(args.length != 1) {
        System.out.println("Использование: ShowFile имя-файла");
        return;
    }
    // В следующем коде применяется оператор TRY с ресурсами для открытия
    // файла и затем его закрытия при покидании блока TRY
    try(FileInputStream fin = new FileInputStream(args[0])) {
        do {
            i = fin.read();
            if(i != -1) System.out.print((char)i);
        } while(i != -1);
    } catch(FileNotFoundException e) {
        System.out.println("Файл не найден");
} catch(IOException e) {
    System.out.println("Произошла ошибка ввода вывода");
}
}
}
