/*import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Удостоверится что были указанны оба файла
        if(args.length !=2) {
            System.out.println("Using: CopyFile source-file");
            return;
        }
        // Copy file
        try {
            // try to open files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Input-output error: " + e);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException e2) {
                System.out.println("error source file not closed");
            }

            try {
                if(fin != null) fin.close();
            } catch(IOException e2) {
                System.out.println("error clone file not closed");
            }
        }
    }
}

*/


/** Версия CopyFile в которой используется оператор TRY с ресурсами
 * здесь демонстрируется управление двумя ресурсами (в данном случае файлами) с помощью одного оператора TRY
 */
//---------------------------------------------------------------------------------------------------------------------
import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException
    {
        int i;
        // Удостоверится что были  указаны оба файла
        
        if(args.length !=2) {
            System.out.println("Использование: CopyFile исходный-файл целевой-файл");
            return;
        }
        // ОТкрыть и управлять двумя файлами посредством оператора try
        

        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]))
        {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}


////////////////////////////////////////////////  САМЫЙ БЫСТРЫЙ ВАРИАНТ КОПИРОВАНИЯ НАдо импорты /////////////////////////////////////////////////////

/**
import java.io.*;
import java.nio.channels.*;

public class CopyFile {
    public static void copyFile(File in, File out)
        throws IOException {
        FileChannel inChannel = new FileInputStream(in).getChannel();
        FileChannel outChannel = new FileOutputStream(out).getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (IOException e){
            throw e;
        }
        finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }

    public static void main(String[] args) throws IOException {
       FileUtils.copyFile(new File(args[0]), new File(args[1])); 
    }
}

*/

